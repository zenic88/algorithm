package com.mscbrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int lastNum = 1;
        int testCase = sc.nextInt();

        List<String> list = new ArrayList<>();
        for(int i = 1; i <= testCase + 1; i++){
            int number = sc.nextInt();

            if(list.size() > 0 && list.get(list.size()-1).equals(String.valueOf(number))){
                System.out.println("-");
                list.remove(String.valueOf(number));
            }else{
                for(int j = lastNum; j <= number; j++){
                    System.out.println("+");
                    list.add(String.valueOf(j));
                }
                if(list.get(list.size()-1).equals(String.valueOf(number))){
                    System.out.println("-");
                    list.remove(String.valueOf(number));
                }else{
                    System.out.println("NO");
                    break;
                }
            }

            if(lastNum < number){
                lastNum = number + 1;
            }

        }
    }
}
