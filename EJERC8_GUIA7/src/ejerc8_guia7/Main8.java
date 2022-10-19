/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales()
b) Método invertirFrase()
c) Método vecesRepetido(String letra)
e) Método compararLongitud(String frase)
f) Método unirFrases(String frase)
g) Método reemplazar(String letra)
h) Método contiene(String letra)
 */
package ejerc8_guia7;

import ejerc8_guia7.entidad.Cadena;
import ejerc8_guia7.servicio.CadenaService;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        CadenaService frases = new CadenaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena fra1 = new Cadena();
        String frase;
        int opc;

        System.out.println("Ingrese una frase:");
        frase = leer.next();
        fra1.setFrase(frase);
        fra1.setLargo(frase.length());

        do {
            System.out.println("Que desea hacer:");
            System.out.println("1:Mostrar vocales");
            System.out.println("2:Invertir frase");
            System.out.println("3:Veces repetida una letra");
            System.out.println("4:Comparar longitud con otra frase");
            System.out.println("5:Unir frases");
            System.out.println("6:Reemplazar letra a");
            System.out.println("7:Contiene cierta letra");
            System.out.println("8:Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    frases.mostrarVocales(fra1);
                    break;
                case 2:
                    frases.invertirFrase(fra1);
                    break;
                case 3:
                    frases.verRepetidos(fra1);
                    break;
                case 4:
                    frases.compararLongitud(fra1);
                    break;
                case 5:
                    frases.unirFrases(fra1);
                    break;
                case 6:
                    frases.reemplazarLetra(fra1);
                    break;
                case 7:
                    System.out.println("Contiene la letra: " + frases.comprobarLetra(fra1));
                    break;
                case 8:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        } while (opc != 8);
    }
    
}
