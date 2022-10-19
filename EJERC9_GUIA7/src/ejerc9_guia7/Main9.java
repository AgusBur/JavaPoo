/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejerc9_guia7;

import ejerc9_guia7.entidad.Matematica;
import ejerc9_guia7.service.MatematicaService;
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        MatematicaService op = new MatematicaService();
        Matematica num1 = new Matematica();
        int opc;
        double n1 = (Math.random() * 5 + 1);
        double n2 = (Math.random() * 5 + 1);
        num1.setNum1(n1);
        num1.setNum2(n2);
        
        op.devolverMayor(num1);
        System.out.println("-------------------------------");
        op.calcularPotencia(num1);
        System.out.println("-------------------------------");
        op.calcularRaiz(num1);
    }

}
