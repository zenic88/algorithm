package com.mscbrain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int ropeCnt = Integer.parseInt(br.readLine());
    int[] ropeLimit = new int[ropeCnt];

    for (int i = 0; i < ropeCnt; i++) {
      ropeLimit[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(ropeLimit);

    int max = 0;
    for (int i = ropeCnt - 1; i > -1; i--) {

      if(max < (ropeCnt - i) * ropeLimit[i]){
        max = (ropeCnt - i) * ropeLimit[i];
      }

    }

    System.out.println(max);
  }
}
