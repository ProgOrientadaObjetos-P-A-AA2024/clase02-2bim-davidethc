/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cadena = "";
        
         boolean continuar = true;
         

        while (continuar) {
            System.out.println("Ingrese nombre:");
            String n = entrada.nextLine();

            System.out.println("Ingrese apellido:");
            String ap = entrada.nextLine();

            System.out.println("Ingrese identificación:");
            String ced = entrada.nextLine();

            System.out.println("Ingrese edad:");
            int edad = entrada.nextInt();

            System.out.println("Ingrese número de créditos:");
            int creditos = entrada.nextInt();

            System.out.println("Ingrese costo de créditos:");
            double costo = entrada.nextDouble();
            entrada.nextLine(); // clear the buffer

            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced, edad, costo,creditos);
            presencial.calcularMatriculaPresencial();
            cadena = String.format("%s%s\n", cadena, presencial);
            
        

            System.out.println("¿Desea ingresar otro estudiante? (si/no)");
             String respuesta = entrada.nextLine();
             if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
                
            }
        
        }
         System.out.println(cadena);
            
        
        //  Ingresar estudiante de tipo presencial por teclado.
        //  El usuario decide cuando terminar
        //  No utilizar super.toString en EstudiantePresencial
        //  Debe existir 1 sola impresión de todos los estudiantes presenciales
        //  No usar arreglos
        
        

        
        
    }
}




