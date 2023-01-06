package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        java.util.Scanner input;
        float radius;
        double total;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextFloat();
        input.close();
        total = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+ radius +" is: "+ total);

    }

}
