package com.zenic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(Arrays.toString(removNb(26).toArray()));
    System.out.println(Arrays.toString(removNb(1000003).toArray()));
    System.out.println(Arrays.toString(removNb(1000008).toArray()));
  }

  public static List<long[]> removNb(long n) {
    // your codex
    // (n * (n + 1)) / 2 - a - b = a * b    (a,b < n, n > 0)
    // (n * (n + 1)) / 2 = a * b + a + b
    List<long[]> list = new ArrayList<>();

    for (int a = 1; a < n - 1; a++) {
      double calc = (n * (n + 1) - 2 * a) / (double) (2 * (a + 1));
      long b = (long) calc;
      if (b < n && b > 0 && calc == b) {
        System.out.println(a + ", " + b + ", " + calc);
        list.add(new long[]{a, b});
      }
    }

    return list;
  }
}
