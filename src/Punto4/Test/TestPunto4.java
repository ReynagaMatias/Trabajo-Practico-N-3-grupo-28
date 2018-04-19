package Punto4.Test;

import Punto4.dominio.GestorArreglo;
import java.util.Scanner;

/**
 *
 * @author Ines
 */
public class TestPunto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[10]; // se crea un vector
        GestorArreglo gestor = new GestorArreglo();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) { // se carga el vector de 10 posiciones
            System.out.println(i + "ingrese numero:");
            int nro = scanner.nextInt();
            num[i] = nro;
            gestor.setNum(num);
        }
        System.out.println("LISTA DE VECTORES");
        gestor.mostrarVector(); // se muestra el vector cargado

        int may = gestor.obtenerMayor();
        int men = gestor.obtenerMenor();
        double prom = gestor.obtenerPromedio();
        System.out.println("EL MAYOR ES :" + may); // se muestra el mayor numero del vector
        System.out.println("EL MENOR ES: " + men); // se muestra el menor numero del vector
        System.out.println("EL PROMEDIO ES: " + prom);// se muestra el promedio de todos los numeros ingresados 

    }

}
