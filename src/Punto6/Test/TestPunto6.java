/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.Test;

import Punto6.dominio.Rectangulo;
import Punto6.utils.GestorRectangulo;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class TestPunto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorRectangulo gestor = new GestorRectangulo();
        Rectangulo rectangulo = new Rectangulo();
        Scanner teclado = new Scanner(System.in);
        double superficie, base , altura, perimetro;
        gestor.mostrarArrayList();
        System.out.println("ingrese la posicion que desea eliminar: ");
        int indice = teclado.nextInt();
        gestor.eliminarRectangulo(indice);
        gestor.mostrarArrayList();
    }
    
}
