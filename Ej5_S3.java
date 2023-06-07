/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_s3;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Ej5_S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String string_students = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: ");
        int students = Integer.parseInt(string_students);
        
        int cont_prom = 0;
        
        int highest_grade = 0;
        int lowest_grade = 2147483647;
        // Este es el valor maximo que un numero puede tener en Java, entonces si se introduce
        // cualquier otro valor por encima, por defecto el programa dara error.
        
        // Es una forma un poco vaga para este ejercicio, pero ya de por si el programador carga
        // con ese estereotipo.
        
        int approved = 0;
        
        for (int i = 0;i < students;i = i+1)
        {
            String string_grade = JOptionPane.showInputDialog("Ingrese su nota: ");
            int grade = Integer.parseInt(string_grade);
            cont_prom = cont_prom + grade; 
            // Aqui≠ se van a acumular las notas de cada estudiante para despues sacar el promedio.
            
            
            if (grade>highest_grade) 
            // Si la siguiente nota es mas alta que la anterior, 
            // entonces ¥highest_grade¥ va a ser el nuevo valor.
            {
                highest_grade = grade;
            }
            
            if (grade<lowest_grade)
            // El gran numero que escribimos antes se transforma en la nota que introducimos despues
            // (suponiendo que sea un valor inferior), y si el siguiente es todavi≠a menor, volvera a cambiar.  
            {
                lowest_grade = grade;
            }
            
            if (grade >= 70)
            {
                approved = approved + 1; 
                // Ira sumando cada estudiante que aprovo, de lo contrario no agregara ningun valor.
            }
            
        }
        
        int prom = (cont_prom/students); //Aqui≠ ya sacamos el promedio con todas las notas que acumulamos
        System.out.println("El promedio de las notas es: "+prom);
        
        System.out.println("La nota m√°s alta fue: "+highest_grade);
        
        System.out.println("La nota m√°s baja fue: "+lowest_grade);
        
        System.out.println("La cantidad de estudiantes aprovados es de: "+approved);


       
        
    }
    
}
