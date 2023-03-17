/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumnum;

import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class SumNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
        System.out.println("enter the first number: ");
       int num1=input.nextInt();
        System.out.println("enter the secont number: ");
       int num2=input.nextInt();
       
       int total=num1+num2;
       
        System.out.println("the total is : "+total);
        
    }
    
}
