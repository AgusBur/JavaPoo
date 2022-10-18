/*
 Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package extra5_guia7;

import java.util.Scanner;

public class MainExtra5 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String vec[]= new String[13];
        
        vec[0]="enero";vec[1]="febrero";vec[2]="marzo";
        vec[3]="abril";vec[4]="mayo";vec[5]="junio";
        vec[6]="julio";vec[7]="agosto";vec[8]="septiembre";
        vec[9]="octubre";vec[10]="noviembre";vec[11]="diciembre";
        
        String secretMonth = vec[9];
        
        String month = "";
        System.out.println("Adivine un mes. Ingrese uno: ");
        month = leer.next();
        while (month.equalsIgnoreCase(secretMonth)==false) {            
        System.out.println("No es ese, ingrese otro..");
        month = leer.next();  
        }
        System.out.println("Correcto!!");
        System.out.println("El mes secreto era: "+secretMonth);
        
    }
    
}
