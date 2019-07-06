package com.mscbrain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    String numCnt = sc.nextLine();
    String str = sc.nextLine();

//    System.out.println(numCnt);
//    System.out.println(str);

    long l = System.currentTimeMillis();

    String[] strArr = str.split(" ");

//    System.out.println(Arrays.toString(list.toArray()));
    int firstNum = Integer.parseInt(strArr[0]);
    Map<Integer, Integer> map = new HashMap<>();

    long count = calculate(firstNum, strArr, 1, Integer.parseInt(numCnt) - 1, map);

//    System.out.println("dp 종료");
    System.out.println(count);

    long interval = System.currentTimeMillis() - l;
    if(interval < 1000){
      System.out.println("0." + interval + "초");
    }else{
      System.out.println(interval / 1000 + "초");
    }

  }

  public static long calculate(int firstNum, String[] strArr, int i, int testCase, Map<Integer, Integer> map){
    long count = 0;

    if(firstNum < 0 || firstNum > 20){
      return 0;
    }

    if(i < testCase){
      int secondNum = Integer.parseInt(strArr[i]);

//      System.out.println("firstNum : " + firstNum + " secondNum : " + secondNum + " " + i);

      i++;

      int sum = firstNum + secondNum;
      int gap = firstNum - secondNum;

//      System.out.println("합 : " + sum + " 차 : " + gap);

      count += calculate(sum, strArr, i, testCase, map);
      count += calculate(gap, strArr, i, testCase, map);
    }else{
//      System.out.println("계산 결과 : " + firstNum + " 제일 뒤에 수 : " + list.get(i));
      if(firstNum == Integer.parseInt(strArr[i])){
        count = 1;
      }
    }

    return count;
  }
}
