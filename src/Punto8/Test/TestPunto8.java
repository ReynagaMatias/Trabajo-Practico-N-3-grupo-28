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
        
        while (r=='s'|| r=='S')
        {
            System.out.println("ingrese ISBN");
            int cod=scanner.nextInt();
            libros.setISBN(cod);
            System.out.println("Ingrese titulo");
            String tit=scanner.next();
            libros.setTitulo(tit);
            System.out.println("Ingrese Autor");
            String aut=scanner.next();
            libros.setAutor(aut);
            System.out.println("Ingrese Precio");
            double pre=scanner.nextDouble();
            libros.setPrecio(pre);
            
            gestor.agregarLibro(libros);
            
            System.out.println("Desea seguir agregando libros");
            String res=scanner.next();
            r=res.charAt(0);
        }
        gestor.mostrarListaDeLibros();
    }
    
}
