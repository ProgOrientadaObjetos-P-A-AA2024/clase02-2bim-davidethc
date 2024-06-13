
package paquete3;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    public EstudiantePresencial(String n, String ap, String iden, int e){
        // public Estudiante(String n, String a, String iden, int ed){
        super(n, ap, iden, e); // cumplir con el constructor de la superClase
    }
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
        @Override
    public String toString (){
        String cadena = String.format("Apellidos Estudiante %s\n"
                +"Identificacion %s" 
                +"Valor Matricula %.2f",
                apellidosEstudiante
                ,obtenerIdentificacionEstudiante(),
                costoCredito,obtenerMatriculaPresencial());
          
             //sale cero toma el valor por defecto y no se le esta mandando valor 
                return cadena;
    }
    //Aqui se se extiende de una super clase que contiene un tostring y dentro de la hijaclase se llamara nuevamente
    
    
    
    
}
