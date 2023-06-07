/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_s3;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Ej6_S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cont_stud = 0; 
        // Como ya no introducimos la cantidad de estudiantes que van a solicitar el sistema, debemos
        // agregar un contador que nos vaya contando uno a uno cuando ingresemos una nota.
        
        int cont_prom = 0;
        
        int highest_grade = 0;
        int lowest_grade = 2147483647;
       
        
        for (int i = 0;i < 2147483647;i = i+1)
        {
            cont_stud = cont_stud + 1; // Aca se estan contando los estudiantes.
            String string_grade = JOptionPane.showInputDialog("Ingrese su nota: ");
            int grade = Integer.parseInt(string_grade);
            cont_prom = cont_prom + grade; 
            
            
            
            if (grade>highest_grade) 

            {
                highest_grade = grade;
            }
            
            if (grade<lowest_grade)

            {
                lowest_grade = grade;
            }
            
            if (grade < 70)
            {
                break; 
 
            }
            
        }
        
        int prom = (cont_prom/cont_stud); // Aqui es donde le sacamos uso a ese contador de estudiantes.
        System.out.println("El promedio de las notas es: "+prom);
        
        System.out.println("La nota más alta fue: "+highest_grade);
        
        System.out.println("La nota más baja fue: "+lowest_grade);
       


       
        
    }
    
}
