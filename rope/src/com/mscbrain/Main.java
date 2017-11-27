package com.mscbrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int ropeCnt = sc.nextInt();
        List<String> ropeLimit = new ArrayList<>();

        for (int i = 0; i < ropeCnt; i++) {
            ropeLimit.add(String.valueOf(sc.nextInt()));
        }

        Arrays.sort(ropeLimit.toArray());

        int min = 0;
        int size = ropeCnt;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < ropeLimit.size(); j++) {
                if (j == 0) {
                    min = Integer.parseInt(ropeLimit.get(j));
                }

                if(min > Integer.parseInt(ropeLimit.get(j))){
                    min = Integer.parseInt(ropeLimit.get(j));
                }
            }
            list.add(ropeCnt * min);
            ropeLimit.remove(String.valueOf(min));
            ropeCnt--;
        }

        System.out.println(Collections.max(list));
    }
}
