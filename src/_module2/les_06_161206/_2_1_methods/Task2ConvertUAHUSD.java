package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

//Написать метод для перевода валют.
public class Task2ConvertUAHUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Income grn");
        double grn = scanner.nextDouble();
        double usd = currencyConverter("UAH","USD",grn);
        System.out.println(Math.round(usd*100)/100.0);
    }
    static double currencyConverter (String from,String to, double amount){
        //double CourseUSDtoUAH=26,7;
        double usdUAH=27.0;
        double uahUSD=1/26.0;
        String fromTo=from+to;
        switch(fromTo){
            case "USDUAH":return amount*usdUAH;
            case "UAHUSD":return amount*uahUSD;
            default: {System.out.println("incorrect currency type!");
                return 0;}
        }
    }
}
