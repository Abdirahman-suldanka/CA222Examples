package WeekTwo;

import java.util.Scanner;

public class FeranhietToCelcius {
    public static void main(String[] args) {
        //create an object from scanner class
        Scanner input = new Scanner(System.in);
        //display prompt to the user
        System.out.print("Enter a degree in Fahrenheit: ");
        // initialization
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        // display the temperature in   Celsius
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
    }
}
