/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author GLORIA
 */
import java.util.Scanner;
public class quadraticEquation {
    
    public static void main(String[] args) {
        //  Enable the user to ente the values of a,b,c
        try (Scanner scanner = new Scanner(System.in)) {
            //  Enable the user to ente the values of a,b,c
            System.out.print("Enter value for a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter value for b: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter value for c: ");
            double c = scanner.nextDouble();
            
            // we can now calcullate the the discriminant
            double discriminant = b * b - 4 * a * c;
            
            // we then calculate the roots based on the discriminant
            if (discriminant > 0) {
                // Two distinct real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                // One real root (repeated)
                double root = -b / (2 * a);
                System.out.println("Root: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}

    

