package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double x1, x2;
        int a, b, c;
        System.out.println("Ax2 + Bx + C = 0");
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Enter A: ");
        quadraticEquation.setA(scanner.nextInt());
        System.out.println("Enter B: ");
        quadraticEquation.setB(scanner.nextInt());
        System.out.println("Enter C: ");
        quadraticEquation.setC(scanner.nextInt());
        double delta = quadraticEquation.getDiscriminant();
        System.out.print("delta= " + delta);
        a = quadraticEquation.getA();
        b = quadraticEquation.getB();
        c = quadraticEquation.getC();

        if (delta > 0) {
            x1 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            x2 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("\nNghiệm của phương trình là: " + x1 + "và" + x2);
        } else if (delta == 0) {
            x1 = x2 = (-b) / (2 * a);
            System.out.println("\nNghiệm của phương trình là x1 = x2 = " + x1);
        } else {
            System.out.println("\nPhương trình vô nghiệm");
        }
    }
}
