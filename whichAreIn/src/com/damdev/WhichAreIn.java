package com.damdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author : zenic
 * Created : 2019-06-08
 */
public class WhichAreIn {

  public static void main(String[] args) {
    String a[] = new String[]{"arp", "live", "strong"};
    String b[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
    System.out.println(Arrays.toString(inArray(a, b)));
    System.out.println(Arrays.toString(inArray2(a, b)));
  }

  // for 문
  public static String[] inArray(String[] array1, String[] array2) {
    List<String> list = new ArrayList<>();
    for (String strArr1 : array1) {
      for (String strArr2 : array2) {
        if (strArr2.contains(strArr1)) {
          list.add(strArr1);
          break;
        }
      }
    }
    String[] strArr = list.toArray(String[]::new);
    Arrays.sort(strArr);

    return strArr;
  }

  // lamda
  public static String[] inArray2(String[] array1, String[] array2) {
    return Arrays.stream(array1)
      .filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
      .distinct()
      .sorted()
      .toArray(String[]::new);
  }
}
