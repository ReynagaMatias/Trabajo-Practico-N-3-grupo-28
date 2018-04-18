/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto12.test;

import Punto8.dominio.Libro;
import java.util.Scanner;
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
        Scanner teclado = new Scanner(System.in);
        char resp = 'S';
        while (resp == 'S' || resp == 's') {
            System.out.println("Desea buscar por titulo y categoria? S/N");
            String busqueda = teclado.next();
            char caracterBusqueda = busqueda.charAt(0);
            if (caracterBusqueda == 's' || caracterBusqueda == 'S') {
                ambos = true;
                System.out.println("Ingrese la categoria: ");
                String categoria = teclado.next();
                System.out.println("Ingrese el titulo: ");
                String titulo = teclado.next();//al titulo se lo iso solamente con .next ya que cuando se ejecuta el metodo de teclado .nextline hace un salto de linea
                libreria.consultarlibro(ambos, titulo, categoria, null);
            } else {
                System.out.println("Ingrese el autor: ");//problema con scanner
                String autor = teclado.next();//aqui tambien se tuvo que poner solamente next por el problema mencionado anteriormente en este caso no da error ya que en la tabla precargada se cargo solamente los apellidos
                libreria.consultarlibro(ambos, null, null, autor);
            }
            System.out.println("Desea realizar otra consulta? S/N");
            String respuesta = teclado.next();
            resp = respuesta.charAt(0);
        }
    }

}
