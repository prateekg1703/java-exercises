package com.exercise.exercise1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** The ExtractMaximumNumberTest class for testing the program. */
class ExtractMaximumNumberTest {

  /**
   * This test case comprises of 6 test cases together using parameterized test annotation provided
   * by Junit 5 Jupiter params i.e. 1) String has no numeric value, 2) String has maximum number at
   * start, 3) String has maximum number at end, 4) String has maximum number in between, 5) String
   * has a maximum number greater than an Integer can support, and 6) String's size is greater than
   * 20 given characters.
   *
   * @param userInput the input provided by user at run-time.
   * @param expectedOutput the output expected by the main program.
   */
  @ParameterizedTest
  @CsvSource(
      value = {
        "abc, 0",
        "9999abc77ad889, 9999",
        "abc77ad88789, 88789",
        "abc7798329ad8889, 7798329",
        "a922337203685477580a, 922337203685477580",
        "a9465465422337203685477585460a, 9465465422337203685477585460"
      })
  void shouldReturnExpectedOutputForProvidedInputString(
      final String userInput, final String expectedOutput) {
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    final PrintStream printStream = new PrintStream(outputStream);
    System.setOut(printStream);
    ExtractMaximumNumber.main(null);
    final String outputFromProgram = outputStream.toString();
    Assert.assertEquals(expectedOutput, outputFromProgram);
  }
}
