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
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Input second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Input third number: ");
        int num3 = input.nextInt();
        
        double avg = ((num1 + num2 + num3) / 3);
        
        System.out.printf("Average of %d, %d and %d is: %f", num1, num2, num3, avg);
    }
    
}
