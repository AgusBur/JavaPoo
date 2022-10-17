/*
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
anterior. */
package ejerc12_guia7.service;

import ejerc12_guia7.entidad.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    
    public void crearPersona() {
        
        System.out.println("Ingrese nombre:");
        p1.setName(leer.next());
        System.out.println("Ingrese año de nacimiento:");
        int year = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento:");
        int month = leer.nextInt();
        System.out.println("Ingrese día de nacimiento:");
        int day = leer.nextInt();
        Date newD = new Date(year-1900,month-1,day);
        p1.setBornDate(newD);
        System.out.println(p1.getBornDate());
    }
    
    public void calcularEdad() {
        Date d2 = new Date();
        int edad = d2.getYear()-p1.getBornDate().getYear();
        System.out.println("La edad es de: "+edad);
    }
    
    public boolean menorQue(int edad2) {
        
        Date d2 = new Date();
        int edad = d2.getYear()-p1.getBornDate().getYear();
        if (edad<edad2) {
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarPersona() {
        System.out.println("Nombre: "+p1.getName());
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha de nacimiento: "+format.format(p1.getBornDate()));
    }
    
}
