package com.mscbrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            String[] strArr = str.split(" ");
            List<String> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                list.add(strArr[j]);
            }
            System.out.println("#" + (i+1) + " " + sort(list));
        }
    }

    public static String sort(List<String> list){

        if(list.size() == 0){
            return "";
        }

        int temp = Integer.parseInt(list.get(0));
        String remove = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(temp > Integer.parseInt(list.get(i))){
                temp = Integer.parseInt(list.get(i));
                remove = list.get(i);
            }
        }

        String result = temp + " ";
        list.remove(remove);

        result += sort(list);

        return result;

    }
}
