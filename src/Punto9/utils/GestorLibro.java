
package Punto9.utils;

import Punto9.dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author Ines
 */
public class GestorLibro {

    ArrayList<Libro> libros = new ArrayList();

    public GestorLibro() { // este es el contructor , aqui se estar cargando los libros de forma estatica
        Libro libro;
        libros.add(libro = new Libro(15432, "Programacion 1", "Manuel Estrada", 84.00));
        libros.add(libro = new Libro(15433, "Estructura de datos", "Esteban Jurado", 94.00));
        libros.add(libro = new Libro(15434, "Base de Dato 1", "Hector Liberatori", 43.00));
        libros.add(libro = new Libro(15435, "Java desde cero", "Alejandro Reynaga", 46.00));
        libros.add(libro = new Libro(15436, "Programacion Web", "Ustares Alvaro", 66.00));

    }

          
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void mostrarListaDeLibros() { //se muestra los libros cargados por consola
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(i + ") " + "ISBN: " + libros.get(i).getISBN() + " Titulo: " + libros.get(i).getTitulo() + " Autor: " + libros.get(i).getAutor() + " Precio: " + libros.get(i).getPrecio());
        }
    }

    public void buscarLibro(String n) { // este metodo realiza la busqueda de un libro por nombre 
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(n)) {

                System.out.println(i + ") " + "ISBN: " + libros.get(i).getISBN() + " Titulo: " + libros.get(i).getTitulo() + " Autor: " + libros.get(i).getAutor() + " Precio: " + libros.get(i).getPrecio());

            }

        }

    }
}
