package WeekTwo;

import java.util.Scanner;

public class CalculateCarPrice {
    public static void main(String[] args) {
        // CALCULATE CAR PRICE
        String carName= "TOYATA";
        String carModal= "af2092";
        double carPrice;
        final double TAX= 65;
        // create object from scanner class
        Scanner input= new Scanner(System.in);
        System.out.println("Enter car price");
        carPrice = input.nextDouble();
        // calculating car price
        double total= carPrice+ TAX;
        System.out.println("the car name is " + carName+ " and the car modal is " + carModal+ " and the car price is " + total);


    }
}
