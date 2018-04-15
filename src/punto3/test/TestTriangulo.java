/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.test;
import java.util.Scanner;
import punto3.dominio.Triangulo;
/**
 *
 * @author Alvaro
 */
public class TestTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        Triangulo triangulo=new Triangulo();
        boolean esTriangulo;
        double a,b,c;
        System.out.println("Este programa verifica si tres lados forman un triangulo");
        System.out.println("Ingrese primer lado");
        a=entrada.nextDouble();
        System.out.println("Ingrese segundo lado");
        b=entrada.nextDouble();
        System.out.println("Inrgese tercer lado");
        c=entrada.nextDouble();
        
        triangulo.setLadoa(a);
        triangulo.setLadob(b);
        triangulo.setLadoc(c);
        
        esTriangulo=triangulo.verificarTriangulo(triangulo.getLadoa(), triangulo.getLadob(), triangulo.getLadoc());
        
        if (esTriangulo){
            
            System.out.println("Los lados ingresados FORMAN UN TRIANGULO, y su perimetro es: "+triangulo.calcularPerimetro(triangulo.getLadoa(), triangulo.getLadob(), triangulo.getLadoc()));
        }
        else{
            System.out.println("Los lados ingresados no forman un triangulo");
        }
        
        
    }
}
    