package WeekTwo;

import java.util.Scanner;

public class ComputeAreaCircle {
    public static void main(String[] args) {
        double radius;
        double area;
        // create object form scanner
        Scanner input= new  Scanner(System.in);
        // initialize variables
        System.out.println("Enter radius");
        radius=input.nextDouble();
        //compute area of circle
        area= radius* radius* 3.14159;
        System.out.println("area: " + area);
    }
}
