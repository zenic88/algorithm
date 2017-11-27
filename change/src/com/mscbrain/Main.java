package com.mscbrain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int payment = sc.nextInt();

        int change = 1000 - payment;

        int count = 0;

        while(change > 0){
            if(change >= 500){
                System.out.println("남은 잔돈 : " + change);
                count += change / 500;
                change = change - (500 * (change / 500));
            }else if(change >= 100){
                System.out.println("남은 잔돈 : " + change);
                count += change / 100;
                change = change - (100 * (change / 100));
            }else if(change >= 50){
                System.out.println("남은 잔돈 : " + change);
                count += change / 50;
                change = change - (50 * (change / 50));
            }else if(change >= 10){
                System.out.println("남은 잔돈 : " + change);
                count += change / 10;
                change = change - (10 * (change / 10));
            }else if(change >= 5){
                System.out.println("남은 잔돈 : " + change);
                count += change / 5;
                change = change - (5 * (change / 5));
            }else if(change >= 1){
                System.out.println("남은 잔돈 : " + change);
                count += change / 1;
                change = change - (1 * (change / 1));
            }
        }

        System.out.println(count);

    }
}
