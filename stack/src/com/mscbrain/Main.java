package com.mscbrain;

import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);

    int popNum;
    int lastNum = 1;
    int testCase = sc.nextInt();

    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= testCase; i++){
      int number = sc.nextInt();

      for(int j = lastNum; j <= number; j++){
        sb.append("+\n");
        stack.push(j);
      }

      if(!stack.empty()){
        popNum = stack.pop();
      }else{
        System.out.println("NO");
        break;
      }

      if(popNum == number){
        sb.append("-\n");
      }else{
        sb = new StringBuilder();
        System.out.println("NO");
        break;
      }

      if(lastNum < number){
        lastNum = number + 1;
      }

    }

    System.out.println(sb);

  }
}
