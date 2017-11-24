package com.mscbrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int N = sc.nextInt();
            int x = 1;

            List<Integer> list = new ArrayList<>();
            while(!check(list)){

                int ret = N * x++;
                String str = String.valueOf(ret);

                for(int j = 0; j < str.length(); j++){
                    if(!list.contains(Integer.parseInt(String.valueOf(str.charAt(j))))){
                        list.add(Integer.parseInt(String.valueOf(str.charAt(j))));
                    }
                }

            }

            System.out.println("#" + (i+1) + " " + (x-1));
        }
    }

    public static boolean check(List<Integer> list){
        boolean result = false;
        int count = 0;

        int size = list.size();
        for(int i = 0; i < size; i++){
            if(list.contains(i)){
                count++;
            }
        }

        if(count == 10){
            result = true;
        }

        return result;
    }

}
