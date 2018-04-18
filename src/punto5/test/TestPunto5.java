/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.test;

import java.util.Scanner;
import punto5.dominio.Circulo;
import punto5.utils.GestorCirculo;

/**
 *
 * @author Alejandro
 */
public class TestPunto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        GestorCirculo circulos = new GestorCirculo();
        Scanner teclado = new Scanner(System.in);
        char respuesta = 'S';
        while(respuesta == 's' || respuesta=='S'){
            System.out.println("Ingrese el radio del circulo que desea agregar: ");
            double radio = teclado.nextDouble();
            circulo.setRadio(radio);
            circulo.calcularSuperficie();
            circulos.agregarCirculo(circulo);
            circulo = new Circulo();
            circulos.mostrarCirculos();
            System.out.println("Desea agregar mas circulos? S/N");
            String resp= teclado.next();
            respuesta = resp.charAt(0);
        }
        System.out.println("La lista de circulos es la siguiente: ");
        circulos.mostrarCirculos();
    }
    
}
