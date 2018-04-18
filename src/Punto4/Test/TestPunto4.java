/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.Test;


import Punto4.dominio.GestorArreglo;
import java.util.Scanner;

/**
 *
 * @author ribeiro
 */
public class TestPunto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestorArreglo gestor = new GestorArreglo();
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0;i<10;i++){
            System.out.println(i + "ingrese numero:");
            int nro=scanner.nextInt();
            gestor.setNum(num);
            
        }
      
        
      
    }
    
}
