/*
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
package ejerc7_guia7.servicio;

import ejerc7_guia7.entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    
    public void crearPersona() {
        boolean bandera = false;
        System.out.println("Ingrese nombre:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad:");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo: f:femenino/m:masculino/o:otro");
        do {            
           String sexo = leer.next();
        if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("o")) {
            p1.setSexo(sexo);
            bandera = true;
        } else {
            System.out.println("Dato incorrecto");
            System.out.println("Ingrese nuevamente f:femenino/m:masculino/o:otro");
        }
        } while (bandera==false);
        System.out.println("Ingrese peso en kg:");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura en metros:");
        p1.setAltura(leer.nextDouble());     
    }
    
    /*
   
    */
    public int calcularImc() {
        
        double imc = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        if (imc < 20) {
            return -1;
        } else if(imc>=20 && imc<=25){
            return 0;
        } else{
            return 1;
        }  
    }
    
    
    public boolean calcularMayorEdad() {
        if (p1.getEdad()>=18) {
            return true;
        } else {
            return false;
        }   
    }
}
