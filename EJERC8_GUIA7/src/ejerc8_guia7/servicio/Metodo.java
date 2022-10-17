/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejerc8_guia7.servicio;


import ejerc8_guia7.entidad.Cadena;
import java.util.Scanner;

public class Metodo {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena frase1 = new Cadena();
    
    
    public void mostrarVocales(Cadena frase1) {
        int contador=0;
        for (int i = 0; i <frase1.getLargo(); i++) {
            if (frase1.getFrase().substring(i,i+1).equalsIgnoreCase("a")
                ||frase1.getFrase().substring(i,i+1).equalsIgnoreCase("e")
                ||frase1.getFrase().substring(i,i+1).equalsIgnoreCase("i")
                ||frase1.getFrase().substring(i,i+1).equalsIgnoreCase("o")
                ||frase1.getFrase().substring(i,i+1).equalsIgnoreCase("u")) {
                contador++;
            }
        }
        
        System.out.println("La frase tiene: "+contador+" vocales");
    }
    
    public void invertirFrase(Cadena frase1) {
        String fraseInvertida = "";
        for (int i =frase1.getLargo()-1; i>=0; i--) {
            char f = frase1.getFrase().charAt(i);
            fraseInvertida = fraseInvertida+f;
        }
        System.out.println(fraseInvertida);
    }
    
    public void verRepetidos(Cadena frase1) {
        System.out.println("Qué letra dentro de la frase desea buscar?");
        String letra=leer.next();
        int contador=0;
        for (int i = 0; i <frase1.getLargo(); i++) {
            if (frase1.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                contador+=1;
            }
        }
        System.out.println("La letra: "+letra+" está repetida "+contador+" veces");
    }
    
    public void compararLongitud(Cadena frase1) {
        System.out.println("Ingrese otra frase para comparar con la original:");
        String frase2 = leer.next();
        int largo = frase2.length();
        if (largo==frase1.getLargo()) {
            System.out.println("Son iguales de largo");
        } else {
            System.out.println("No son iguales de largo");
        }
    }
    
    public void unirFrases(Cadena frase1) {
        System.out.println("Ingrese frase para concatenar:");
        String frase2 = leer.next();
        System.out.print(frase1.getFrase()+frase2);
        System.out.println("");
    }
    
    public void reemplazarLetra(Cadena frase1) {
        System.out.println("Ingrese letra/carácter por el que desea reemplazar a la letra A:");
        String caract = leer.next();
        String nuevaFrase =" ";
        String f;
        
        for (int i = 0; i <frase1.getLargo(); i++) {
            f=frase1.getFrase().substring(i, i+1);
            if (f.equalsIgnoreCase("a")) {
                f=caract;
            }
            nuevaFrase+=f;
        }
        System.out.println(nuevaFrase);
    }
    
    public boolean comprobarLetra(Cadena frase1) {
        System.out.println("Que letra desea buscar?");
        String letra = leer.next();
        int contador=0;
        
        for (int i = 0; i <frase1.getLargo(); i++) {
            if (frase1.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
                contador+=1;
                break;
            } 
        }
        return contador!=0;
    }
}
