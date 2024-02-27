package org.example;


public class HomeTask1{
    public static void main(String[] args) {


        int money = 1000;
        int snickersPrice = 35;
        double candysPrice = 3.5;
        int countOfSnickers = money/snickersPrice;
        int moneyAfterBuyingSnickers = money -(countOfSnickers * snickersPrice);

        System.out.println(countOfSnickers + " сникерсов куплено");

        double countOfCandys =  (int)(moneyAfterBuyingSnickers / candysPrice);
        System.out.println(countOfCandys + " конфет куплено");

        double theRemainingMoneyAfterAllPurchases = money - ((countOfSnickers * snickersPrice) + (countOfCandys * candysPrice));
        System.out.println(theRemainingMoneyAfterAllPurchases + " рубля - оставшаяся сдача после всей покупки");



    }
}
