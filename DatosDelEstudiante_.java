/*
  Implemente un algoritmo que le permita solicitar el ingreso por teclado el
nombre de la universidad,el departamento, la carrera, el nombre de la materia, 
nombres completos del estudiante,nivel, numero de cedula, pais, ciudad, 
canton, provincia, ID, sexo. 

 */
package datosdelestudiante_;

/**
 *
 * @author:Ana Graciela Pico Solis 
 */
import java.util.Scanner;
public class DatosDelEstudiante_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner objeto=new Scanner(System.in);//new, reserva espacio de memoria
        System.out.println("Ingrese el nombre de la Universidad:");
        String nombreUniversidad=objeto.nextLine();
        
        System.out.println("Ingrese el Departamento:");
        String departamento=objeto.nextLine();
        
        System.out.println("Ingrese la Carrera:");
        String carrera=objeto.nextLine();
        
        System.out.println("Ingrese el nombre de la materia:");
        String materia=objeto.nextLine();
        
        System.out.println("Ingrese los nombres completos del estudiante:");
        String nombre=objeto.nextLine();
        
        System.out.println("Ingrese el nivel:");
        String nivel=objeto.nextLine();
        
        System.out.println("Ingrese el numero de cédula:");
        String cédula=objeto.nextLine();
        
        System.out.println("Ingrese el pais de origen:");
        String pais=objeto.nextLine();
        
        System.out.println("Ingrese la ciudad:");
        String ciudad=objeto.nextLine();
        
        System.out.println("Ingrese el canton:");
        String canton=objeto.nextLine();
        
        System.out.println("Ingrese la provincia:");
        String provincia=objeto.nextLine();
        
        System.out.println("Ingrese su ID:");
        String ID=objeto.nextLine();
        
        System.out.println("Ingrese su tipo de sexo:");
        String sexo=objeto.nextLine();
        
        System.out.println("Bienvenido a la Universidad:" +nombreUniversidad);
        
        
    }
    
}
