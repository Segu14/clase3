/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_s3;

/**
 *
 * @author sebas
 */
public class Ej1_S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // Cree un proyecto que imprima un rectángulo de 10 símbolos
        // en 5 líneas, pero sólo puede imprimir una a la vez.
        
        int i = 0;
        int j = 0;
        
        while (j<5)
        {
            
            while (i<10)
            {
            System.out.print("@");
            i = i+1;
            }
            
         i = 0;
         System.out.println("");
         j = j + 1;
        }
     
        
        
        
        
        
        
        
    }
    
}
