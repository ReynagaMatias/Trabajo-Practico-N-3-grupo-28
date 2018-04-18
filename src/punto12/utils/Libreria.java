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
    private ArrayList<Autor> autores = new ArrayList();

    public Libreria() {
        Autor autor;
        autores.add(autor = new Autor("Hector", "Tarifa"));
        autores.add(autor = new Autor("Hector", "Liberatori"));
        autores.add(autor = new Autor("Stephen", "Hawking"));
        autores.add(autor = new Autor("Richard", "Stalman"));
        autores.add(autor = new Autor("Anabel", "Rosales"));
        autores.add(autor = new Autor("Caceres", "Pedro"));
        autores.add(autor = new Autor("Marciel", "Jack"));
        autores.add(autor = new Autor("Peñaloza", "Alfredo"));
        categorias.add("Matematica");
        categorias.add("Informatica");
        categorias.add("Astronomia");
        categorias.add("Gastronomia");
        categorias.add("Terror");
        Libro libro;
        libros.add(libro = new Libro(2018, "metodos de demostracion", autores.get(0), categorias.get(0), 25));
        libros.add(libro = new Libro(3421, "Teoremas", autores.get(0), categorias.get(0), 234));
        libros.add(libro = new Libro(3021, "Introduccion a la inf", autores.get(3), categorias.get(1), 25));
        libros.add(libro = new Libro(8921, "Base de Datos", autores.get(1), categorias.get(1), 206));
        libros.add(libro = new Libro(8912, "Teoria del todo", autores.get(2), categorias.get(2), 2015));
        libros.add(libro = new Libro(2018, "Estrellas", autores.get(2), categorias.get(2), 218));
        libros.add(libro = new Libro(8223, "Coccion", autores.get(4), categorias.get(3), 201));
        libros.add(libro = new Libro(1827, "Gourmet", autores.get(5), categorias.get(3), 839));
        libros.add(libro = new Libro(7384, "chuky", autores.get(6), categorias.get(4), 387));
        libros.add(libro = new Libro(8374, "Uija", autores.get(7), categorias.get(4), 372));
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

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void consultarlibro(boolean ambos, String tituloBuscado, String categoriaBuscado, String autorBuscado) {
        for (int i = 0; i < libros.size(); i++) {
            if (ambos == false && autorBuscado !=null ) {
                if (libros.get(i).getAutor().getApellido().equals(autorBuscado) || libros.get(i).getAutor().getNombre().equals(autorBuscado)) {
                    System.out.println("Los datos del libro buscado son: El ISBN es: " + libros.get(i).getISBN() + " el titutlo es: " + libros.get(i).getTitulo() + ". El autor es: " + libros.get(i).getAutor().getNombre()+","+libros.get(i).getAutor().getApellido() + ". La categoria es: " + libros.get(i).getCategoria() + ". El precio es: " + libros.get(i).getPrecio());
                }
            } else {
                if (ambos == true && tituloBuscado != null && categoriaBuscado!=null) {
                    if ((libros.get(i).getTitulo().equals(tituloBuscado)) || (libros.get(i).getCategoria().equals(categoriaBuscado))) {
                        System.out.println("Los datos del libro buscado son: El ISBN es: " + libros.get(i).getISBN() + " el titutlo es: " + libros.get(i).getTitulo() + ". El autor es: " + libros.get(i).getAutor() + ". La categoria es: " + libros.get(i).getCategoria() + ". El precio es: " + libros.get(i).getPrecio());
                    }
                }else{
                    if(ambos==false && categoriaBuscado!=null){
                        if(libros.get(i).getCategoria().equals(categoriaBuscado)){
                            System.out.println("Los datos del libro buscado son: El ISBN es: "+ libros.get(i).getISBN()+" el titulo es: "+libros.get(i).getTitulo()+". El nombre del autor es:"+ libros.get(i).getAutor().getNombre()+". La Categoria es: "+libros.get(i).getCategoria()+", El precio es: "+libros.get(i).getPrecio());
                        }
                    }else{
                        if(ambos==false && tituloBuscado!=null){
                            if(libros.get(i).getTitulo().equals(tituloBuscado)){
                                System.out.println("Los datos del libro buscado son: El ISBN es: "+ libros.get(i).getISBN()+" el titulo es: "+libros.get(i).getTitulo()+". El nombre del autor es:"+ libros.get(i).getAutor().getNombre()+". La Categoria es: "+libros.get(i).getCategoria()+", El precio es: "+libros.get(i).getPrecio());
                            }
                        }
                    }
                }
            }
        }
    }
}
