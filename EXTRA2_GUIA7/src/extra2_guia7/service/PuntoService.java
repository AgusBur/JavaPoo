/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package extra2_guia7.service;

import extra2_guia7.entidad.Puntos;
import java.util.Scanner;

public class PuntoService {
    
    Scanner leer = new Scanner(System.in);
    Puntos p1 = new Puntos();
    
    public void crearPuntos() {
        
        System.out.println("Ingrese la coordenada en x del 1er punto:");
        p1.setX1(leer.nextInt());
        System.out.println("Ingrese la coordenada en y del 1er punto:");
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese la coordenada en x del 2do punto:");
        p1.setX2(leer.nextInt());
        System.out.println("Ingrese la coordenada en y del 2do punto:");
        p1.setY2(leer.nextInt());     
        
    }
    
    public void calcularDistancia() {
        double distancia = 0;
        double cateto1 = (p1.getX2())-(p1.getX1());
        double cateto2 = (p1.getY2())-(p1.getY1());
        distancia = Math.sqrt((Math.pow(cateto1,2))+(Math.pow(cateto2,2)));
        System.out.println("La distancia entre el 1er punto y el 2do es: "+distancia);
    }
}

/*Para calcular la distancia entre dos puntos, se usa el Teorema de pitágoras:
Plantea que: la distancia entre PUNTO 1 (necesita coordenadas en eje x e y) y PUNTO 2
(también se requieren datos de las coordenadas de ese pto en x e y) es igual a:
la RAIZ CUADRADA de la DIFERENCIA= (x2(del pto2) - x1(del pto1))^2 AL CUADRADO, MÁS
la DIFERENCIA DE = (y2(del pto2) - y1(del pto1))^2 TMB AL CUADRADO.
*/