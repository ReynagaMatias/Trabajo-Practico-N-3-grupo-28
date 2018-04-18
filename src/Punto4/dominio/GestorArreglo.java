/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.dominio;

/**
 *
 * @author Ines
 */
public class GestorArreglo {

    int[] num = new int[10]; //se crea el arreglo de 10 elementos de tipo entero

    public GestorArreglo() {

    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public void mostrarVector() { // en este metodo se muestra el vector cargado 
        for (int i = 0; i < num.length; i++) {
            System.out.println("[" + i + "]" + num[i]);
        }

    }

    public int obtenerMayor() { // en este metodo se obtiene el mayor numero del vector
        int mayor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (mayor < num[i]) {
                mayor = num[i];
            }
        }
        return mayor;
    }

    public int obtenerMenor() { // en este metodo se obtiene el menor numero de los elementos del vector
        int men = num[0];
        for (int i = 0; i < num.length; i++) {
            if (men > num[i]) {
                men = num[i];
            }
        }
        return men;
    }
    
    public double obtenerPromedio(){ //en este metodo se calcula el promedio de la suma de los valores del vector dividido el tamaño del vector en este caso 10
        double prom;
        int total=0;
        for (int i = 0; i < num.length; i++){
            total=total+num[i];
       
        }
        prom=total/num.length;
        return prom;
    }

}
