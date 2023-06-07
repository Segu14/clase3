/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_s3;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Ej3_S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String string_cant = JOptionPane.showInputDialog("Ingrese un valor");
        int cant = Integer.parseInt(string_cant);
        
        int i = 0;
        int j = 0;
        
        while (i<cant)
        {
            while (j<i)
            {
                System.out.print("*");
                j = j + 1;
            }
           
            j = 0;
            System.out.println("");
            i = i + 1;
         
        }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
