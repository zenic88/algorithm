package com.damdev.buyingAcar;

/**
 * Author : zenic
 * Created : 2019-06-08
 */
public class BuyCar {

  public static void main(String[] args) {
    nbMonths(2000, 8000, 1000, 1.5);

    nbMonths(12000, 8000, 1000, 1.5);
  }

  private static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth,
    double percentLossByMonth) {
    // your code
    if (startPriceOld > startPriceNew) {
      return new int[]{0, startPriceOld - startPriceNew};
    }

    int money = 0;
    int month = 1;

    double oldPrice = (double) startPriceOld;
    double newPrice = (double) startPriceNew;

    double rate = (100 - percentLossByMonth) / 100;

    while (money + oldPrice < newPrice) {
      if (month % 2 == 0) {
        rate -= 0.005;
      }
      oldPrice = oldPrice * rate;
      newPrice = newPrice * rate;

      money += savingperMonth;
      month++;
    }

    money = (int) Math.round((money + oldPrice) - newPrice);

    return new int[]{month, money};
  }
}
