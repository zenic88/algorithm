package com.zenic;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(1 + ", Roman : " + solution(1));
    System.out.println(4 + ", Roman : " + solution(4));
    System.out.println(6 + ", Roman : " + solution(6));
    System.out.println(1990 + ", Roman : " + solution(1990));
    System.out.println(2008 + ", Roman : " + solution(2008));
    System.out.println(1666 + ", Roman : " + solution(1666));
    System.out.println(1557 + ", Roman : " + solution(1557));
  }

  public static String solution(int n) {
    StringBuilder sb = new StringBuilder();
    int thousand = n / 1000;
    sb.append("M".repeat(Math.max(0, thousand)));
    int hundred = n % 1000 / 100;
    sb.append(placed(hundred, "C", "D", "M"));

    int ten = n % 1000 % 100 / 10;
    sb.append(placed(ten, "X", "L", "C"));

    int one = n % 1000 % 100 % 10;
    sb.append(placed(one, "I", "V", "X"));

    return sb.toString();
  }

  public static String placed(int num, String min, String mid, String max) {
    StringBuilder sb = new StringBuilder();

    if (num == 9) {
      sb.append(min).append(max);
      num = 0;
    } else if (num >= 5) {
      sb.append(mid);
      num -= 5;
    } else if (num == 4) {
      sb.append(min).append(mid);
      num = 0;
    }
    sb.append(String.valueOf(min).repeat(Math.max(0, num)));

    return sb.toString();
  }
}
