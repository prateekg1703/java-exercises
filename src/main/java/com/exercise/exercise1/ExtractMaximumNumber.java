package com.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;

/** The ExtractMaximumNumber class. */
public class ExtractMaximumNumber {

  /**
   * The main method to execute the program for extracting maximum number from a given string.
   *
   * @param args arguments for main method
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String alphaNumericValue = sc.nextLine();
    System.out.print(maxNumber(alphaNumericValue));
    sc.close();
  }

  /**
   * This private method receives the alphanumeric string, splits it into an array using regex and
   * removes other characters, converts it into a stream and finds the maximum number using stream
   * functions.
   *
   * @param alphaNumericValue the input value by user
   * @return the maximum number obtained from the alphanumeric string
   */
  private static Long maxNumber(final String alphaNumericValue) {
    return Arrays.stream(alphaNumericValue.split("[^\\d]"))
        .filter(s -> !"".equals(s))
        .mapToLong(Long::parseLong)
        .max()
        .orElse(0);
  }
}
