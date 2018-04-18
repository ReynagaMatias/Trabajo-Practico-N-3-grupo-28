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
        //se instancian las clases necesarias
        Circulo circulo = new Circulo();
        GestorCirculo circulos = new GestorCirculo();
        Scanner teclado = new Scanner(System.in);
        //las variables 
        char respuesta = 'S';
        while(respuesta == 's' || respuesta=='S'){
            //se pide al usuario el ingreso del radio
            System.out.println("Ingrese el radio del circulo que desea agregar: ");
            double radio = teclado.nextDouble();
            //se envia el radio al objeto circulo
            circulo.setRadio(radio);
            //se realiza el llamamiento a los metodos que se desea obtener
            circulo.calcularSuperficie();
            circulos.agregarCirculo(circulo);
            //se crea un nuevo objeto del tipo circulo para luego poder volver a agregar al ArrayList con la misma variable
            circulo = new Circulo();
            //se muestra El ArrayList
            circulos.mostrarCirculos();
            //se pregunta si se desea agregar mas circulos
            System.out.println("Desea agregar mas circulos? S/N");
            String resp= teclado.next();
            respuesta = resp.charAt(0);
        }
        System.out.println("La lista de circulos es la siguiente: ");
        circulos.mostrarCirculos();
    }
    
}
