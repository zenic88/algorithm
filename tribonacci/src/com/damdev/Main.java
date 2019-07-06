package com.damdev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{11, 7, 17}, 4)));
    }

    public static double[] tribonacci(double[] s, int n) {
        // hackonacci me
        if(s.length == n || n < 4){
            if(n == 0){
                return new double[]{};
            }else if(n == 1){
                return new double[]{s[0]};
            }else if(n == 2){
                return new double[]{s[0], s[1]};
            }
            return s;
        }

        double[] doubleArr = new double[s.length + 1];
        for (int i = 0; i <= s.length; i++) {
            if(i < s.length){
                doubleArr[i] = s[i];
            }else if(i > 2){
                doubleArr[i] = s[i-3] + s[i-2] + s[i-1];
            }
        }
        doubleArr = tribonacci(doubleArr, n);

        return doubleArr;


        /*
          double[] tritab=Arrays.copyOf(s, n);
          for(int i=3;i<n;i++){
            tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
          }
          return tritab;
         */
    }
}
