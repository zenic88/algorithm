package com.damdev;

import java.util.Arrays;

/**
 * Author : zenic
 * Created : 2019-06-08
 */
public class uniqueNumber {

  public static void main(String[] args) {
    System.out.println(findUniq(new double[]{0, 1, 0}));
    System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
  }

  public static double findUniq(double arr[]) {
    // Do the magic
    Arrays.sort(arr);
    return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
  }
}
