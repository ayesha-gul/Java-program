/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author Ayesha Razzaq
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your name and age");
         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         int age = sc.nextInt();
         
         System.out.println("Name: "+name+ " "+ "Age:"+ age);
         
    }
    
}
