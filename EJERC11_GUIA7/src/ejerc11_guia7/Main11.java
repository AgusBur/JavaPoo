/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejerc11_guia7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Main11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un día:");
        int dia = leer.nextInt();
        System.out.println("Ingrese un mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese un año:");
        int anio = leer.nextInt();
        
        Date fecha1 = new Date(anio-1900,mes-1,dia);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Fecha ingresada es: ");
        System.out.println(formato.format(fecha1));
        Date fecha2 = new Date();
        System.out.print("La fecha actual es: ");
        System.out.println(formato.format(fecha2));
        System.out.print("La diferencia de años entre ambas fechas es: ");
        anio = fecha2.getYear()-fecha1.getYear();
        System.out.println(anio+" años");
        
        
        
        
    }
    
}
