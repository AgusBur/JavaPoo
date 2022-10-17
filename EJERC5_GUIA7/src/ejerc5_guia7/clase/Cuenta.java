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
saldo actual en 0.s
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejerc5_guia7.clase;

import java.util.Scanner;

public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    private int numCuenta;
    private long dni;
    private int saldoActual;
    private int interes;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long dni, int saldoActual, int interes) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    public void pedirDatos(){
        System.out.println("Ingrese num de cuenta:");
        numCuenta = leer.nextInt();
        System.out.println("Ingrese num dni:");
        dni = leer.nextLong();
        System.out.println("Ingrese saldo actual:");
        saldoActual = leer.nextInt();
        System.out.println("");
    }
    
    public void ingresarDinero(){
        System.out.println("Ingrese cantidad de dinero:");
        double platita = leer.nextDouble();
        setSaldoActual((int)platita+saldoActual);   
    }
    
    public void retirarDinero(){
        System.out.println("Ingrese cantidad de dinero a retirar:");
        double retiro = leer.nextDouble();
        if (saldoActual<retiro) {
            System.out.println("No tiene esa cantidad, solo le puedo dar: "+saldoActual);
            setSaldoActual(saldoActual=0);
        } else {
            System.out.println("Retirando plata..");
            setSaldoActual(saldoActual-(int)retiro);
        }
    }
    
    public void extraerRapido(){
        System.out.println("Ingrese cantidad de dinero a retirar:");
        double retiro2 = leer.nextDouble();
        if (retiro2<=(saldoActual*0.20)) {
            System.out.println("Si puede retirarlo");
        } else {
            System.out.println("No podes retirarlo");
        }
    }
    
    public double consultarSaldo (){
        return saldoActual;
    }
    
    public void consultarDatos (){
        System.out.println("Sus datos son:");
        System.out.println("Su dni es: "+getDni());
        System.out.println("Su num de cuenta es: "+getNumCuenta());
    }

    
}
