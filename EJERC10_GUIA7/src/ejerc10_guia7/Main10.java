/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejerc10_guia7;

import java.util.Arrays;

public class Main10 {

    public static void main(String[] args) {

        double vectorA[] = new double[50];
        double vectorB[] = new double[20];
        double vector[] = new double [10];

        inicializarVector(vectorA);
        System.out.println("");
        ordenarVector(vectorA,vector);
        System.out.println("");
        rellenarVector(vector, vectorB);
    }

    public static void inicializarVector(double[] vectorA) {

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random() * 9 + 1);
        }
        System.out.println("Vector 1 aleatorio:");
        System.out.println(Arrays.toString(vectorA));
        System.out.println("");
    }

    public static void ordenarVector(double[] vectorA, double [] vector) {

        Arrays.sort(vectorA);
        System.out.println("Vector 1 ordenado:");
        System.out.println(Arrays.toString(vectorA));
        System.out.println("");
        
        for (int i = 0; i <10; i++) {
            vector[i]=vectorA[i];
        }
        System.out.println(Arrays.toString(vector));
    }
    
    public static void rellenarVector (double [] vector,double [] vectorB) {
        
        for (int i = 0; i < vectorB.length; i++) {
            if (i<10) {
                vectorB[i]=vector[i];
            } else {
                vectorB[i]=0.5;
            }
        }
        System.out.println("Vector 2 cargado:");
        System.out.println(Arrays.toString(vectorB));
    }
}
