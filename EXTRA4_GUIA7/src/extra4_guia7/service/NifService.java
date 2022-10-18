/*
 • Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package extra4_guia7.service;

import extra4_guia7.entidad.Nif;
import java.util.Scanner;


public class NifService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Nif n1 = new Nif();
    
    public void crearNif() {
        
        System.out.println("Ingrese número de DNI:");
        n1.setDni(leer.nextLong());
        
        String vector[] = new String[23];
        
        vector[0] = "T"; vector[1] = "R"; vector[2] = "W";
        vector[3] = "A"; vector[4] = "G"; vector[5] = "M";
        vector[6] = "Y"; vector[7] = "F"; vector[8] = "P";
        vector[9] = "D"; vector[10] = "X"; vector[11] = "B";
        vector[12] = "N"; vector[13] = "J"; vector[14] = "Z";
        vector[15] = "S"; vector[16] = "Q"; vector[17] = "V";
        vector[18] = "H"; vector[19] = "L"; vector[20] = "C";
        vector[21] = "K"; vector[22] = "";
        
        int x=0;
        x= (int)n1.getDni()%23;
        n1.setLetra(vector[x]);
    }
    
    public void mostrarNif() {
        
        System.out.println("El DNI y su letra:");
        System.out.println(n1.getDni()+"-"+n1.getLetra());
        
    }
}
