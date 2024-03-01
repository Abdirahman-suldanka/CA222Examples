package WeekTwo;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        // calculate average
        double num1, num2, num3;
        // creata object from scanner class
        Scanner input= new Scanner(System.in);
        System.out.println("Enter three numbers");
        num1=input.nextDouble();
        num2=input.nextDouble();
        num3=input.nextDouble();
        // calculate average
        double average= (num1+num2+num3)/3;
        // display average
        System.out.println("Average of three numbers is: " + average);
    }
}
