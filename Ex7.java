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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
    }
    
}
