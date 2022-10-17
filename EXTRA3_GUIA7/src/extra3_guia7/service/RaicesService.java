/*
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package extra3_guia7.service;

import extra3_guia7.entidad.Raices;
import java.util.Scanner;

public class RaicesService {
    
    Scanner leer = new Scanner(System.in);
    Raices r1 = new Raices();
    
    public void pedirDatos() {
        
        System.out.println("Ingrese valor de coeficiente a:");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese valor de coeficiente b:");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese valor de coeficiente c:");
        r1.setC(leer.nextInt());
    }
    
    //Discriminante=(b^2)-4*a*c
    private double getDiscriminante() {
        return (Math.pow(r1.getB(),2))-(4*r1.getA()*r1.getC());
    }
    
    private boolean tieneRaices() {
        return getDiscriminante()>=0;
    }
    
    private boolean tieneRaiz() {
        return getDiscriminante()==0;
    }
    
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    private void obtenerRaices() {
        double resultado1=0, resultado2=0;
        
        if (tieneRaices()) {
           resultado1= (-(r1.getB())+Math.sqrt((Math.pow(r1.getB(),2)-
                        (4*r1.getA()*r1.getC()))))/(2*r1.getA());
           resultado2= (-(r1.getB())-Math.sqrt((Math.pow(r1.getB(),2)-
                        (4*r1.getA()*r1.getC()))))/(2*r1.getA());
        }
        System.out.println("2 soluciones:");
        System.out.println("Resultado 1 = "+resultado1);
        System.out.println("Resultado 2 = "+resultado2);
    }
    
    private void obtenerRaiz() {
        double resultado = 0;
        if (tieneRaiz()) {
            resultado= (-(r1.getB())+Math.sqrt((Math.pow(r1.getB(),2)-
                        (4*r1.getA()*r1.getC()))))/(2*r1.getA());
        }
        System.out.println("Única soluciíon:");
        System.out.println(resultado);
    }
    
    public void calcular() {
        
        if (tieneRaiz()) {
            obtenerRaiz();
        } else if (tieneRaices()){
            obtenerRaices();
        } else {
            System.out.println("No tiene ninguna posible solución");
        }
    }
}
