/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package extra6_guia7.entidad;

public class Ahorcado {
    
    private int letterTotal;
    private String vec[] = new String[1];
    private int times;

    public Ahorcado() {
    }

    public Ahorcado(int letterTotal, int times) {
        this.letterTotal = letterTotal;
        this.times = times;
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }

    public int getLetterTotal() {
        return letterTotal;
    }

    public void setLetterTotal(int letterTotal) {
        this.letterTotal = letterTotal;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
    
    
}
