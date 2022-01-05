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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        
        System.out.printf("Product of the given numbers: %d", num1 * num2);
    }
    
}
