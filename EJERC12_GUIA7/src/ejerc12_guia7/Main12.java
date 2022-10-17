/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package ejerc12_guia7;

import ejerc12_guia7.service.PersonaService;
import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        PersonaService p = new PersonaService();
        
        p.crearPersona();
        p.calcularEdad();
        System.out.println("Ingrese edad de otra persona para comparar:");
        int edad2 = leer.nextInt();
        System.out.println("La persona 2 es mayor que la 1: "+p.menorQue(edad2));
        System.out.println("Los datos de la persona 1 ingresada son:");
        p.mostrarPersona();
    }
    
}
