/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.test;

import java.util.Scanner;
import punto1.dominio.Calculadora;
import punto1.dominio.Punto;

/**
 *
 * @author Alvaro
 */
public class TestPunto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        Calculadora calculadora =new Calculadora();
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        
        double x1,x2,y1,y2;
        
        System.out.println("Ingrese X1");
        x1=entrada.nextDouble();
        System.out.println("Ingrese Y1");
        y1=entrada.nextDouble();
        System.out.println("Ingrese X2");
        x2=entrada.nextDouble();
        System.out.println("Ingrese Y2");
        y2=entrada.nextDouble();
        
        punto1.setX(x1);
        punto1.setY(y1);
        punto2.setX(x2);
        punto2.setY(y2);
        
        calculadora.setUnPunto(punto1);
        calculadora.setUnPunto(punto2);
        

        System.out.println("La distancia entre los puntos es= "+calculadora.obtenerDistancia());
    }
    
}
