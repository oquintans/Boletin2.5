/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float metros,millas;
        
        System.out.println("Millas:");
        Scanner dato=new Scanner(System.in);
        millas=dato.nextFloat();
        
        metros=millas*1852;
        System.out.println("Metros:"+metros);
        
    }
    
}
