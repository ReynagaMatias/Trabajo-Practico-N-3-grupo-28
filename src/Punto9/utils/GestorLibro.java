/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9.utils;

import Punto9.dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GestorLibro {

    ArrayList<Libro> libros = new ArrayList();

    public GestorLibro() {
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

    public void mostrarListaDeLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(i + ") " + "ISBN: " + libros.get(i).getISBN() + " Titulo: " + libros.get(i).getTitulo() + " Autor: " + libros.get(i).getAutor() + " Precio: " + libros.get(i).getPrecio());
        }
    }

    public void buscarLibro(String n) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(n)) {

                System.out.println(i + ") " + "ISBN: " + libros.get(i).getISBN() + " Titulo: " + libros.get(i).getTitulo() + " Autor: " + libros.get(i).getAutor() + " Precio: " + libros.get(i).getPrecio());

            }

        }

    }
}
