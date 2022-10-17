/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejerc6_guia7.servicio;

import ejerc6_guia7.clase.Cafetera;
import java.util.Scanner;

public class Metodo {
    
    Scanner leer = new Scanner(System.in);
    Cafetera caf1 = new Cafetera();
    
    public void llenarCafetera() {
        System.out.println("Ingrese capacidad máxima");
        caf1.setCapacidadMax(leer.nextInt());
        System.out.println("Ingrese cantidad actual:");
        caf1.setCantidadActual(leer.nextInt());
        caf1.setCantidadActual(caf1.getCapacidadMax());
    }
    
    public void servirTaza() {
        System.out.println("Ingrese tamaño de una taza vacía");
        int taza = leer.nextInt();
        if (caf1.getCantidadActual() >= taza) {
            System.out.println("Se llenó la taza");
        } else {
            System.out.println("No alcanzó para llenar la taza");
            System.out.println("La taza se llenó con "+ caf1.getCantidadActual());

        }
    }
    
    public void vaciarCafetera() {
        caf1.setCantidadActual(0);
    }
    
    public void agregarCafe() {
        System.out.println("Ingrese cantidad de café para agregar a cafetera:");
        int cafe = leer.nextInt();
        caf1.setCantidadActual(cafe);
        System.out.println("Tu cantidad actual ahora es: "+caf1.getCantidadActual());
    }
}
