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
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        
        int num1 = input.nextInt();
        
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;
        
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d%n%d mod %d = %d", num1, num2, sum, num1, num2, sub, num1, num2, mul, num1, num2, div, num1, num2, rem);
    }
    
}
