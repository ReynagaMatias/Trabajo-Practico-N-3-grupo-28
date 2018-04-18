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
    //se creara un arrayList pimero de libros
    private ArrayList<Libro> libros = new ArrayList();
    //tambien se creara un arrayList de categorias que almacernara las categorias de los libros
    private ArrayList<String> categorias = new ArrayList();
    //aqui se creara el ArrayList de autor que posee tambien los autorses
    private ArrayList<Autor> autores = new ArrayList();
//en este constructor que vemos acontinuacion se crearon todos los ArrayList de tipo estatico es decir tenemos todos nuestros arrayList precargados
    public Libreria() {
        Autor autor;
        //agregamiento de autores dentro del arrayList
        autores.add(autor = new Autor("Hector", "Tarifa"));
        autores.add(autor = new Autor("Hector", "Liberatori"));
        autores.add(autor = new Autor("Stephen", "Hawking"));
        autores.add(autor = new Autor("Richard", "Stalman"));
        autores.add(autor = new Autor("Anabel", "Rosales"));
        autores.add(autor = new Autor("Caceres", "Pedro"));
        autores.add(autor = new Autor("Marciel", "Jack"));
        autores.add(autor = new Autor("Peñaloza", "Alfredo"));
        //se agregar las categorias dentro del ArrayList de categoria
        categorias.add("Matematica");
        categorias.add("Informatica");
        categorias.add("Astronomia");
        categorias.add("Gastronomia");
        categorias.add("Terror");
        Libro libro;
        //el agregar los libros que tiene categorias y autores
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
//los getters y setters de los ArrayList
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

    //el metodo consultar que por parametro le pasamos si busca por ambos campos o solamente por 1 en individual
    public void consultarlibro(boolean ambos, String tituloBuscado, String categoriaBuscado, String autorBuscado) {
        for (int i = 0; i < libros.size(); i++) {//primero recorremos todo el arrayList de liros
            if (ambos == false && autorBuscado !=null ) {//luego preguntamos  si no se busca por ambos campors y el autor que pasa el usuario es distinto de null entonces se realiza la busqueda por autor
                if (libros.get(i).getAutor().getApellido().equals(autorBuscado) || libros.get(i).getAutor().getNombre().equals(autorBuscado)) {//se pregunta si el apellido del autor o el nombre del autor es igual a lo que ingreso el usuario
                //y en la linea siguiente se mostrara los datos en caso de haberlo encontrado
                    System.out.println("Los datos del libro buscado son: El ISBN es: " + libros.get(i).getISBN() + " el titutlo es: " + libros.get(i).getTitulo() + ". El autor es: " + libros.get(i).getAutor().getNombre()+","+libros.get(i).getAutor().getApellido() + ". La categoria es: " + libros.get(i).getCategoria() + ". El precio es: " + libros.get(i).getPrecio());
                }
            } else {
                if (ambos == true && tituloBuscado != null && categoriaBuscado!=null) {//aquise preguntara si se busca por ambos campos como es verdad entonces buscaremos por la categoria y el titulobuscado
                    //entonces se comparara entre el titulo ingresado por el usuario y el titulo que se encuentra dentro del ArrayList de Libros y se realizara lo mismo con la caterogira solamente en categoria se buscara dentro del ArayList de categoria
                    if ((libros.get(i).getTitulo().equals(tituloBuscado)) || (libros.get(i).getCategoria().equals(categoriaBuscado))) {
                        //y se moestrara los datos del libro
                        System.out.println("Los datos del libro buscado son: El ISBN es: " + libros.get(i).getISBN() + " el titutlo es: " + libros.get(i).getTitulo() + ". El autor es: " + libros.get(i).getAutor() + ". La categoria es: " + libros.get(i).getCategoria() + ". El precio es: " + libros.get(i).getPrecio());
                    }
                }else{
                    if(ambos==false && categoriaBuscado!=null){//aqui igual se preguntara si se desea buscar por ambos y si la categoriaque ingres elusuario es distinta a null
                        //entonces se preguntara si la categria buscada es igual a alguna categoira que se encuentra dentro del ArrayList
                        if(libros.get(i).getCategoria().equals(categoriaBuscado)){
                            //y se uestra los resultados en caso de haberlo encontrado
                            System.out.println("Los datos del libro buscado son: El ISBN es: "+ libros.get(i).getISBN()+" el titulo es: "+libros.get(i).getTitulo()+". El nombre del autor es:"+ libros.get(i).getAutor().getNombre()+". La Categoria es: "+libros.get(i).getCategoria()+", El precio es: "+libros.get(i).getPrecio());
                        }
                    }else{
                        if(ambos==false && tituloBuscado!=null){//aqui igual como no se busca por ambos campos entonces verificamos que el usuario haya ngresado algo y no sea nullo
                            //y se comparara si el titulo buscado es igual a los itulos que se encuentran dentro del ArrayList de libros
                            if(libros.get(i).getTitulo().equals(tituloBuscado)){
                                //y se muestra los resultados en caso de haberlos encontrado
                                System.out.println("Los datos del libro buscado son: El ISBN es: "+ libros.get(i).getISBN()+" el titulo es: "+libros.get(i).getTitulo()+". El nombre del autor es:"+ libros.get(i).getAutor().getNombre()+". La Categoria es: "+libros.get(i).getCategoria()+", El precio es: "+libros.get(i).getPrecio());
                            }
                        }
                    }
                }
            }
        }
    }
}
