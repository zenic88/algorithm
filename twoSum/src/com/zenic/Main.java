package com.zenic;

public class Main {

  public static void main(String[] args) {
    // write your code here
    doTest(new int[]{1, 2, 3}, new int[]{0, 2});
    doTest(new int[]{1234, 5678, 9012}, new int[]{1, 2});
    doTest(new int[]{2, 2, 3}, new int[]{0, 1});
  }

  public static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null; // Do your magic!
  }

  private static void doTest(int[] numbers, int[] expected) {
    int target = numbers[expected[0]] + numbers[expected[1]];
    int[] actual = twoSum(numbers, target);
    if (null == actual) {
      System.out.format("Received a null\n");
    }
    if (actual.length != 2) {
      System.out.format("Received an array that's not of length 2\n");
    }
    int received = numbers[actual[0]] + numbers[actual[1]];
    System.out.printf("target : %d, received : %d\n", target, received);
  }
}
