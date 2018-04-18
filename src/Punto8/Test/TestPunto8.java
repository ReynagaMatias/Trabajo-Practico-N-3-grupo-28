/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.Test;

import Punto8.dominio.Libro;
import Punto8.utils.GestorLibro;
import java.util.Scanner;

/**
 *
 * @author Iness
 */
public class TestPunto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestorLibro gestor = new GestorLibro();
        Libro libros = new Libro();
        
        Scanner scanner = new Scanner(System.in);
        
        
        char r='s';
       
        
        while (r=='s'|| r=='S') // se pide los datos del libro hasta que el usuario hasta que el usuario lo disponga
        {
            System.out.println("ingrese ISBN ");
            int cod=scanner.nextInt();
            libros.setISBN(cod);
            scanner.nextLine();
            System.out.println("Ingrese titulo ");
            String tit=scanner.nextLine();           
            libros.setTitulo(tit);
            System.out.println("Ingrese Autor ");
            String aut=scanner.nextLine();
            libros.setAutor(aut);
           
            System.out.println("Ingrese Precio ");
            double pre=scanner.nextDouble();
            libros.setPrecio(pre);
            scanner.nextLine();
            
            gestor.agregarLibro(libros);
            libros  = new Libro();
            gestor.mostrarListaDeLibros(); // se realiza el llamamiento del metodo mostrarListaDeLibro de la clase GestorLibro
            
            System.out.println("Desea seguir agregando libros");
            String res=scanner.next();
            r=res.charAt(0);
        }
        
    }
    
}
