/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejerc9_guia7.servicio;

import ejerc9_guia7.entidad.Matematica;
import java.util.Scanner;

public class Metodos {
    
    Scanner leer = new Scanner(System.in);
    Matematica n1 = new Matematica();

    
    public void devolverMayor(Matematica n1) {
        double numA,numB,resultado;
        numA=Math.round(n1.getNum1());
        numB=Math.round(n1.getNum2());
        System.out.println("n° 1: "+numA);
        System.out.println("n° 2: "+numB);
        System.out.println("-------------------------------");
        System.out.println("El n° mayor es: "+Math.max(numA, numB));  
    }
    
    public void calcularPotencia(Matematica n1) {
        
        double numA,numB;
        numA=Math.round(n1.getNum1());
        numB=Math.round(n1.getNum2());
        System.out.println("El n° mayor elevado al n° menor es: "
                +Math.pow((Math.max(numA, numB)),Math.min(numA,numB)));
    }
    
    public void calcularRaiz(Matematica n1) {
        double numA,numB;
        numA=Math.abs(n1.getNum1());
        numB=Math.abs(n1.getNum2());
        System.out.println("n° 1: "+numA);
        System.out.println("n° 2: "+numB);
        System.out.println("La raiz cuadrada del n° menor es: "
                +Math.sqrt(Math.min(numA, numB)));
    }
}
