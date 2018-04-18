/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.Test;

import Punto2.dominio.Punto;
import Punto2.dominio.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Punto2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //aqui se instancia las clases que se necesitaran para hacer los llamamientos y poder hacer que el programa funcione
        Punto p1 = new Punto();
        Scanner teclado = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        //se declara las variables
        double altura, base;
        double perimetro, superficie;
        //se pide al usuario los datos que se necesitaran
        System.out.println("Ingrese la coordenada X del punto1: ");
        double x = teclado.nextDouble();
        System.out.println("Ingrese la coordenada y del punto1: ");
        double y = teclado.nextDouble();
        //se envia los datos a la clase punto
        p1.setX(x);
        p1.setY(y);
        rectangulo.setPunto1(p1);
        //se pide el ingreso de datos de base y altura
        System.out.println("Ingrese la base");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura");
        //se envia la base y la altura para poder trabajar dentro de la clase
        altura = teclado.nextDouble();
        rectangulo.setBase(base);
        rectangulo.setAltura(altura);
        //se calcula los puntos el perimetro y la superficie
        rectangulo.calcularPunto2();
        rectangulo.calcularPunto3();
        rectangulo.calcularPunto4();
        //se muestra los resultados
        System.out.println("las coordenadas x del punto2 son: "+rectangulo.getPunto2().getX()+" las coordenadas y es: "+rectangulo.getPunto2().getY());
        System.out.println("Las coordenadas y del punto3 son: "+rectangulo.getPunto3().getX()+" las coordenadas y es: "+rectangulo.getPunto3().getY());
        System.out.println("Las coordenadas y del punto4 son: "+rectangulo.getPunto4().getX()+" Las coordenadas y es: "+rectangulo.getPunto4().getY());
        System.out.println("el perimetro es : "+rectangulo.calcularPerimetro());
        System.out.println("la superficie es: "+rectangulo.calcularSuperficie());
    }
    
}
