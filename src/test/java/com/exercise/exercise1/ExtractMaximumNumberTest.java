package com.exercise.exercise1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

/** The ExtractMaximumNumberTest class for testing the program. */
public class ExtractMaximumNumberTest {

  @Test
  public void shouldReturnZeroWhenStringDoesNotHaveAnyNumericValue() {
    final String userInput = "dfs";
    final String expectedOutput = "0";
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    final PrintStream printStream = new PrintStream(outputStream);
    System.setOut(printStream);
    ExtractMaximumNumber.main(null);
    final String outputFromProgram = outputStream.toString();
    Assert.assertEquals(expectedOutput, outputFromProgram);
  }

  @Test
  public void shouldReturnMaximumNumberWhenMaxValueIsAtStart() {
    final String userInput = "9999dfsd77ad889";
    final String expectedOutput = "9999";
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    final PrintStream printStream = new PrintStream(outputStream);
    System.setOut(printStream);
    ExtractMaximumNumber.main(null);
    final String outputFromProgram = outputStream.toString();
    Assert.assertEquals(expectedOutput, outputFromProgram);
  }

  @Test
  public void shouldReturnMaximumNumberWhenMaxValueIsAtEnd() {
    final String userInput = "dfsd77ad88789";
    final String expectedOutput = "88789";
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    final PrintStream printStream = new PrintStream(outputStream);
    System.setOut(printStream);
    ExtractMaximumNumber.main(null);
    final String outputFromProgram = outputStream.toString();
    Assert.assertEquals(expectedOutput, outputFromProgram);
  }

  @Test
  public void shouldReturnMaximumNumberWhenMaxValueIsInBetween() {
    final String userInput = "dfsd7798329ad8889";
    final String expectedOutput = "7798329";
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
