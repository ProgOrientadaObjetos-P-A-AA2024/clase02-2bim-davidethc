    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Creación de un objeto de tipo EstudianteDistancia
        
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre, 
                apellido, identificacion, edad);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.establecerCostoAsignatura(100);
        estDistancia.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);
        
        EstudiantePresencial estPresencial = new    EstudiantePresencial(nombre, 
                apellido, identificacion, edad);
        estPresencial.establecerNumeroCreditos(3);
        estPresencial.establecerCostoCredito(10);
        estPresencial.calcularMatriculaPresencial();
        
                
        
    }
}
