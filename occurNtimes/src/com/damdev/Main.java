package com.damdev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(Arrays.toString(deleteNth(new int[]{20, 37, 20, 21}, 1)));
    System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)));
    System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)));
    System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 1, 1, 1}, 5)));
    System.out.println(Arrays.toString(deleteNth(new int[]{}, 5)));
  }

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    //Code here ;)
    if (elements.length == 0) {
      return elements;
    }
    if(maxOccurrences == 0){
      return new int[]{};
    }
    int idx = 0;
    int[] retArr = new int[elements.length];
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < elements.length; i++) {
      String key = elements[i] + "";
      if (map.get(key) == null) {
        map.put(key, 1);
        retArr[idx++] = elements[i];
      } else if (map.get(key) < maxOccurrences) {
        map.put(key, map.get(key) + 1);
        retArr[idx++] = elements[i];
      }
    }

    return Arrays.copyOfRange(retArr, 0, idx);
  }
}
