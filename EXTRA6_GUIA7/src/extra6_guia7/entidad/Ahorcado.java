/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package extra6_guia7.entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    
    private int lettersFound;
    private int missingLetters;
    private String vec[];
    private String vec2[];
    private int opportunities;

    public Ahorcado() {
    }

    public Ahorcado(int lettersFound, int missingLetters, String[] vec, String[] vec2, int opportunities) {
        this.lettersFound = lettersFound;
        this.missingLetters = missingLetters;
        this.vec = vec;
        this.vec2 = vec2;
        this.opportunities = opportunities;
    }

    public int getLettersFound() {
        return lettersFound;
    }

    public void setLettersFound(int lettersFound) {
        this.lettersFound = lettersFound;
    }

    public int getMissingLetters() {
        return missingLetters;
    }

    public void setMissingLetters(int missingLetters) {
        this.missingLetters = missingLetters;
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }

    public String[] getVec2() {
        return vec2;
    }

    public void setVec2(String[] vec2) {
        this.vec2 = vec2;
    }

    public int getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(int opportunities) {
        this.opportunities = opportunities;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private void crearJuego() {
        
        System.out.println("===============Configuremos el juego===============");
        System.out.println("Ingrese palabra para el juego:");
        String word = leer.next();
        word = word.toUpperCase();
        System.out.println("Ingrese cantidad máxima de jugadas:");
        opportunities=(leer.nextInt());
   
        int large = word.length();
        vec= new String[large];
        vec2 = new String[vec.length];
        Arrays.fill(vec2,"_");
        
        for (int i = 0; i <large; i++) {
              vec[i]=word.substring(i, i+1);
        }  
        missingLetters=large;
        lettersFound=0;
    }
    
    private void limpiarPantalla() {
        
    }
    
    private void verLongitud() {
        System.out.println("La palabra secreta tiene:  "+vec.length+" letras");
    }
    
    private boolean comprobarLetra(String letter) {
        boolean ret=false;
        for (int i = 0; i <vec.length; i++) {
            if (vec2[i].equalsIgnoreCase(letter)) {
                ret=true;
                break;
            } else {
                ret=false;
            }
        }
        if (ret) {
            System.out.println("Ya ingresaste esa letra!");
        } else {
            System.out.println("Buscando letra....");
        }
        return ret;
    }
    
    private void buscar(String letter) {
        int count=0;
        for (int i = 0; i <vec.length; i++) {
            if (vec[i].equalsIgnoreCase(letter)) {
               count++;
            }
        }
        if (count!=0) {
            System.out.println("-La letra SI ESTÁ en la palabra!!"); 
        } else {
            System.out.println("-Ohh la letra NO ESTÁ en la palabra");
        }
    }
    
    private void verEncontradas(String letter) {
        
        int count = 0;
        boolean found=false;
        
        for (int i = 0; i <vec.length; i++) {
            if (vec[i].equalsIgnoreCase(letter)) {
                count++;
                found=true;
            }
        }
        
        if (found) {
            missingLetters-=count;
            lettersFound+=count;
            System.out.println("-Cantidad de letras en palabra: "+count);       
        } else {
            opportunities--;
        }     
    }
    
    private void verPalabra(String letter) {

        for (int i = 0; i < vec.length; i++) {
            if (vec[i].equalsIgnoreCase(letter)) {
                vec2[i]=letter;
            } 
        }
        System.out.println("-Palabra secreta:");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(" "+vec2[i]+" ");
        }
   
    }
    
    private void verIntentos() {
        if (opportunities>1) {
            System.out.println("-Intentos restantes: "+opportunities);
        } else if (opportunities==1){
            System.out.println("-Te queda solo 1 intento!!!");
        } else {
            System.out.println("-Te quedaste sin intentos!!");
        }
    }
    
    public void jugarAhorcado() {
        crearJuego();
        System.out.println("");
        System.out.println("");
        System.out.println("Juguemos al ahorcadito!!");
        System.out.println("=============================================");
        verLongitud();
        System.out.println("Tenes: "+opportunities+" intentos para adivinar");
        
        do {         
            System.out.println("=========================================");
            System.out.println("Ingrese una letra a buscar en la palabra:");
            String letter = leer.next();
            while (comprobarLetra(letter)==true) {                
            System.out.println("=========================================");
            System.out.println("Ingrese una letra a buscar en la palabra:");
            letter = leer.next();
            }
            buscar(letter);
            verEncontradas(letter);
            if (opportunities!=1) {
                verPalabra(letter);
                System.out.println("");
                System.out.println("-Letras encontradas: "+lettersFound);
                System.out.println("-Letras que faltan: "+missingLetters);
            }
            verIntentos();
        } while (opportunities>=1 && missingLetters!=0);
        
        if (opportunities==0 || missingLetters==0) {
            System.out.println("============================================");
            if (missingLetters==0) {
                System.out.println("-GANASTE!!!");
            } else {
                System.out.println("-Perdiste...");
            }
        }
        System.out.println("La palabra a encontrar era:");
        System.out.println(Arrays.toString(vec));
    }
}
