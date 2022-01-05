/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercises;
import java.util.Scanner;

/**
 *
 * @author Storyteller
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        
        System.out.printf("Area is %f * %f = %f%nPerimeter is 2 * (%f + %f) = %f", width, height, (width * height), width, height, (2 * (width + height)));
    }
    
}
