/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto12.test;

import Punto8.dominio.Libro;
import java.util.Scanner;
import punto12.utils.Autor;
import punto12.utils.Libreria;

/**
 *
 * @author Alejandro
 */
public class TestPunto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libreria libreria = new Libreria();
        Libro libro = new Libro();
        boolean ambos = false;
        int opc;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoint = new Scanner(System.in);
        char resp = 'S';
        do {
            System.out.println("-------------MENU-----------");
            System.out.println("1) Buscar por titulo y categoria?");
            System.out.println("2) Buscar solo por titulo");
            System.out.println("3) Buscar solo por categoria");
            System.out.println("4) Buscar por Autor");
            System.out.println("5( Salir del programa");
            System.out.println("seleccione una opcion");
            opc = tecladoint.nextInt();
            switch (opc) {
                case 1:
                    ambos = true;
                    for(int i=0;i< libreria.getLibros().size();i++){
                        System.out.println("Titulo; "+libreria.getLibros().get(i).getTitulo()+", Categoria; " + libreria.getCategorias().get(i));
                    }
                    System.out.println("Ingrese la categoria: ");
                    String categoria = teclado.nextLine();
                    System.out.println("Ingrese el titulo: ");
                    String titulo = teclado.nextLine();
                    libreria.consultarlibro(ambos, titulo, categoria, null);
                    break;
                case 2:
                    ambos = false;
                    for(int i = 0; i< libreria.getLibros().size();i++){
                        System.out.println(libreria.getLibros().get(i).getTitulo());
                    }
                    System.out.println("Ingrese el titulo por el cual desea buscar");
                    String titulo1 = teclado.nextLine();
                    libreria.consultarlibro(ambos, titulo1, null, null);
                    break;
                case 3:
                    ambos = false;
                    for(int i = 0; i<libreria.getCategorias().size();i++){
                        System.out.println(libreria.getCategorias().get(i));
                    }
                    System.out.println("Ingrese la categoria por la cual desea buscar");
                    String categoria1 = teclado.nextLine();
                    libreria.consultarlibro(ambos, null, categoria1, null);
                    break;
                case 4:
                    ambos = false;
                    Autor autor = new Autor();
                    for(int i=0;i<libreria.getAutores().size();i++){
                    System.out.println(libreria.getAutores().get(i).getApellido()+", "+libreria.getAutores().get(i).getNombre());
                    }
                    System.out.println("Ingrese el apellido o apellido del autor: ");
                    String nombreautor = teclado.next();
                    libreria.consultarlibro(ambos, null, null, nombreautor);
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta");
                    break;

            }
        } while (opc != 5);
    }
}
