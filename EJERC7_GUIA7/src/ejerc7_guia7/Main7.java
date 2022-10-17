/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ejerc7_guia7;

import ejerc7_guia7.entidad.Persona;
import ejerc7_guia7.servicio.Metodo;

public class Main7 {

    public static void main(String[] args) {
       
        Metodo salud = new Metodo();
        Persona p = new Persona();
        int bajop=0, pesoIdeal=0,sobrep=0,mayor=0,menor=0;
        
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Persona n°: "+(i+1));
            salud.crearPersona();
            switch (salud.calcularImc()) {
                case -1:
                    System.out.print("Tiene bajo peso ");
                    bajop++;
                    break;
                case 0:
                    System.out.print("Tiene el peso ideal ");
                    pesoIdeal++;
                    break;
                case 1:
                    System.out.print("Tiene sobrepeso ");
                    sobrep++;
                    break;
            }
            
            if(salud.calcularMayorEdad() == true){
                System.out.println(" y es mayor de edad.");
                mayor++;
            }else {
                System.out.println(" y es menor de edad.");
                menor++;
            }
            System.out.println("-----------------------------------------");
        }

        System.out.println("Promedio de personas bajo peso es: "+(bajop*100/4)+" %");    
        System.out.println("Promedio de personas con peso ideal es: "+(pesoIdeal*100/4)+" %");
        System.out.println("Promedio de personas con sobrepeso es: "+(sobrep*100/4)+" %"); 
        System.out.println("Promedio de personas mayores de edad es: "+(mayor*100/4)+" %"); 
        System.out.println("Promedio de personas menores de edad es: "+(menor*100/4)+" %"); 
    }
    
}
