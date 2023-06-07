/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_s3;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Ej2_S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        int printnum = Integer.parseInt(num);
        
        for (int i = 0; i < 11; i = i + 1)
            {
                System.out.println(printnum+" * "+i+" = "+(printnum * i));
            }
        }
    }
    
