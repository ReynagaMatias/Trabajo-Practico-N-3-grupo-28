/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.Test;

import Punto10.dominio.Producto;
import Punto10.utils.GestorCompra;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ines
 */
public class TestPunto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorCompra gestor = new GestorCompra();
        Producto productos = new Producto();
        DecimalFormat formato=new DecimalFormat("#0.00");

        Scanner scanner = new Scanner(System.in);

        char r = 's';

        // aqui ingresa los datos los datos del producto  y se pide el numero de cuotas en que desea pagar por el producto
        while (r == 's' || r == 'S') {
            System.out.println("Ingrese codigo del Producto");
            String cod = scanner.next();
            productos.setCodigo(cod);
            scanner.nextLine();
            System.out.println("Ingrese nombre del producto");
            String nom = scanner.nextLine();

            productos.setNombre(nom);
       
            System.out.println("Ingrese precio");
            double pr = scanner.nextDouble();
            productos.setPrecio(pr);
            
            gestor.agregarProducto(productos);
            productos=new Producto();
            gestor.mostrarListaDeProductos();

            System.out.println("ingrese en cuatas cuotas desea pagar (hasta 24 cuotas)");
            int cuo = scanner.nextInt();
            if (cuo<=24){
            System.out.println("LISTA DE CUOTAS CON INTERESES");
            gestor.mostrarValorDeCuotas(pr, cuo);
            }else{
                System.out.println("NO SE PERMITE MAS DE 24 CUOTAS");
            }
           
            System.out.println("Desea seguir comprando productos");
            String res = scanner.next();
            r = res.charAt(0);

        }
        
    }

}
