/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package extra1_guia7;

import extra1_guia7.entidad.Cancion;
import java.util.Scanner;


public class MainExtra1 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Cancion song1 = new Cancion();
        System.out.println("Ingrese una el nombre de una canción:");
        song1.setTitulo(read.next());
        System.out.println("Ingrese el autor:");
        song1.setAutor(read.next());
        System.out.println("---------------------");
        System.out.println("La canción ingresada:");
        System.out.println(song1.toString());
    }
    
}
