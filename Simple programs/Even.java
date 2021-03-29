/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even;
import java.util.Scanner;
/**
 *
 * @author Ayesha Razzaq
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
         Scanner s = new Scanner(System.in);
         n = s.nextInt();
         if ( n % 2 == 0) {
             System.out.println("number is even");
             
         }
         else {
             System.out.println("NUMber is not even");
         }
    }
    
}
