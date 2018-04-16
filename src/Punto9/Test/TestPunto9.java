/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Scanner scanner= new Scanner(System.in);
       
          
        gestor.mostrarListaDeLibros();  
        
       
 
     
        System.out.println("ingrese nombre del Libro que desea buscar ");
        String n= scanner.nextLine();
        gestor.buscarLibro(n);
        
      
    }
    
}
