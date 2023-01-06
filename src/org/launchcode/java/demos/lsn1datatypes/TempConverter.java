package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;
// Comment exaple
/* Multi-line
comment
example
*/
public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        java.util.Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
