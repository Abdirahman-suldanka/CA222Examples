import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        String name= "ahmed ";
        int age=  12;
        double salary= 200.0;
        System.out.println("the name is "+ name + " and the age is: " +age +" and the salary is " + salary);

        // here enter the data from the keyboard
        Scanner input =new Scanner(System.in);
        double d = input.nextDouble();
        System.out.println(d);
    }
}
