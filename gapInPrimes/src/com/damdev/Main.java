package com.damdev;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println("답 : " + Arrays.toString(gap(2, 100, 110))); // "[101, 103]"
    System.out.println("답 : " + Arrays.toString(gap(4, 100, 110))); // "[103, 107]"
    System.out.println("답 : " + Arrays.toString(gap(6, 100, 110))); // null
    System.out.println("답 : " + Arrays.toString(gap(8, 300, 400))); // "[359, 367]"
    System.out.println("답 : " + Arrays.toString(gap(10, 300, 400))); // "[337, 347]"
  }

  public static long[] gap(int g, long m, long n) {
    // your code
    int idx = 0;
    long[] longArr = new long[2];
    long start = m % 2 == 0 ? m + 1 : m;

    for (long i = start; i <= n; i+=2) {
      int count = 0;
      int limit = (int) Math.sqrt(i);
      for (int j = 2; j <= limit; j++) {
        if (i % j == 0 && i != j) {
          count++;
        }
      }

      if(count == 0){
        longArr[idx++] = i;
        if(longArr[0] != 0 && longArr[1] != 0){
          if(longArr[1] - longArr[0] ==g){
            break;
          }else{
            idx = 0;
            longArr[idx++] = i;
            longArr[idx] = 0;
          }
        }
      }
    }

    if (longArr[1] - longArr[0] == g) {
      return longArr;
    }

    return null;
  }
}
