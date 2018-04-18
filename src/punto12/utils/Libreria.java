/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto12.utils;

import java.util.ArrayList;
import punto12.dominio.Libro;

/**
 *
 * @author Alejandro
 */
public class Libreria {
    private ArrayList<Libro> libros = new ArrayList();
    private ArrayList<String> categorias = new ArrayList();

    public Libreria() {
        categorias.add("Matematica");
        categorias.add("Informatica");
        categorias.add("Astronomia");
        categorias.add("Gastronomia");
        categorias.add("Terror");
        Libro libro;
        libros.add(libro = new Libro(2018, "metodos de demostracion", "Nahuel", categorias.get(0), 25));
        libros.add(libro = new Libro(3421, "Teoremas", "Tarifa", categorias.get(0), 234));
        libros.add(libro = new Libro(3021, "Int a la inf", "Marcos", categorias.get(1), 25));
        libros.add(libro = new Libro(8921, "Base de Datos", "Liberatori", categorias.get(1), 206));
        libros.add(libro = new Libro(8912, "Teoria del todo", "Steven", categorias.get(2), 2015));
        libros.add(libro = new Libro(2018, "Estrellas", "Stalman", categorias.get(2), 218));
        libros.add(libro = new Libro(8223, "Coccion", "Lolo", categorias.get(3), 201));
        libros.add(libro = new Libro(1827, "Gourmet", "Valentino", categorias.get(3), 839));
        libros.add(libro = new Libro(7384, "chuky", "Reynaga", categorias.get(4), 387));
        libros.add(libro = new Libro(8374, "Uija", "Alvarillo", categorias.get(4), 372));
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    public void consultarlibro(boolean ambos,String tituloBuscado,String categoriaBuscado,String autorBuscado){
        for(int i = 0 ; i< libros.size();i++){
            if(ambos==false){
                if(libros.get(i).getAutor().equals(autorBuscado)){
                    System.out.println("Los datos del libro buscado son: El ISBN es: "+libros.get(i).getISBN()+" el titutlo es: "+libros.get(i).getTitulo()+". El autor es: "+libros.get(i).getAutor()+". La categoria es: "+libros.get(i).getCategoria()+". El precio es: "+libros.get(i).getPrecio());
                }
            }else{
                if((libros.get(i).getTitulo().equals(tituloBuscado)) || (libros.get(i).getCategoria().equals(categoriaBuscado))){
                    System.out.println("Los datos del libro buscado son: El ISBN es: "+libros.get(i).getISBN()+" el titutlo es: "+libros.get(i).getTitulo()+". El autor es: "+libros.get(i).getAutor()+". La categoria es: "+libros.get(i).getCategoria()+". El precio es: "+libros.get(i).getPrecio());
                }
            }
        }
    }
}
