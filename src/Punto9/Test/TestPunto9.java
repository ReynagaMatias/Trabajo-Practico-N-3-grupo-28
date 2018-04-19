package Punto9.Test;

import Punto9.dominio.Libro;
import Punto9.utils.GestorLibro;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestPunto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorLibro gestor = new GestorLibro();
        Libro libros = new Libro();
        Scanner scanner = new Scanner(System.in);

        gestor.mostrarListaDeLibros();  // se realiza el llamamiento del metodo mostrarListaDeLibro de la clase GestorLibro

        System.out.println("ingrese nombre del Libro que desea buscar ");
        String n = scanner.nextLine();
        gestor.buscarLibro(n); // se realiza el llamamiento del metodo buscarLibro de la clase GestorLibro

    }

}
