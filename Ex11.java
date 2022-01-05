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
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double radius = 7.5;
        double area = Math.PI * (radius * radius);
        double perimeter = 2 * Math.PI * radius;
        
        System.out.printf("Perimeter is: %f%nArea is: %f", perimeter, area);
    }
    
}
