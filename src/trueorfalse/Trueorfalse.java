/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trueorfalse;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Trueorfalse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tanya;
        System.out.print("Apakah Anda lapar? (ya atau tidak) : ");
        tanya = scan.next();
        if ("Ya".equalsIgnoreCase(tanya))
        {
            System.out.println("Makan");
        }
        else
        {
           System.out.println("tidak makan"); 
                }
    }
}