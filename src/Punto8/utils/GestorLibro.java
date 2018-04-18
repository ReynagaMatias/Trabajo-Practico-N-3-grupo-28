/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.utils;

import Punto8.dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GestorLibro {
    ArrayList<Libro> libros = new ArrayList();

    public GestorLibro() {
    }
    
    

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibro(Libro libros){ //este metodo agrega libros en la ultima posicion de un ArrayList
        this.libros.add(libros);
        
    }
    public void mostrarListaDeLibros(){ // este metodo muestra la lista de los libros ingresador por el usuario
        for(int i=0; i<libros.size();i++)
            System.out.println(i+") " + "ISBN: "+libros.get(i).getISBN()+"  Titulo: "+libros.get(i).getTitulo()+"  Autor: "+libros.get(i).getAutor()+ "  Precio: "+libros.get(i).getPrecio());
    }
    
}
