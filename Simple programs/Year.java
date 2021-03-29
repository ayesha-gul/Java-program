/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year;
import java.util.Scanner;
/**
 *
 * @author Ayesha Razzaq
 */
public class Year {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y;
        boolean flag = false;
        System.out.println("Enter Crruent202 year");
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
      if (y == 2021) {
          flag = true;
          System.out.println("Correct year");
      }
      else {
          flag = false;
          System.out.println("WRong year");
      }
   }
}
