/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejerc5_guia7;

import ejerc5_guia7.clase.Cuenta;
import java.util.Scanner;

public class Main5 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opc;
        Cuenta cajero = new Cuenta();
        cajero.pedirDatos();
        
        
        do { 
            System.out.println("Ingrese opción que desea:");
        System.out.println("1:Ingresar dinero");
        System.out.println("2:Retirar dinero");
        System.out.println("3:Extraer dinero rápido");
        System.out.println("4:Consultar saldo");
        System.out.println("5:Consultar datos");
        System.out.println("6:Salir");
        opc = leer.nextInt();
         switch (opc){
            case 1: cajero.ingresarDinero();
            break;
            case 2: cajero.retirarDinero();
            break;
            case 3: cajero.extraerRapido();
            break;
            case 4: System.out.println("Su saldo es: "+cajero.consultarSaldo());
            break;
            case 5: cajero.consultarDatos();
            break;
            case 6: System.out.println("Saliendo..");
            break;
            default: System.out.println("Ingrese opción válida");   
        }   
        } while (opc!=6);
        
             
                
    }
    
}
