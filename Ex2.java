/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises;
import java.util.Scanner;
/**
 *
 * @author Storyteller
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        
        System.out.printf("The summation is: %d", num1 + num2);
    }
}
