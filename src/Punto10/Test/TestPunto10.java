/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.Test;


import Punto10.dominio.Producto;
import Punto10.utils.GestorCompra;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestPunto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorCompra gestor = new GestorCompra();
        Producto productos=new Producto();
        
        Scanner scanner=new Scanner(System.in);
        
        
        char r='s';
       
        // aqui ingresa los datos los datos del producto  y se pide el numero de cuotas en que desea pagar por el producto
        while (r=='s'|| r=='S')
        {
            System.out.println("Ingrese codigo del Producto");
            String cod=scanner.next();
            productos.setCodigo(cod);
            scanner.nextLine();
            System.out.println("Ingrese nombre del producto");
            String nom=scanner.nextLine();
            
            productos.setNombre(nom);
            
            System.out.println("Ingrese precio");
            double pr=scanner.nextDouble();
             productos.setPrecio(pr);
            
            
            gestor.agregarProducto(productos);
            gestor.mostrarListaDeProductos();
            
           System.out.println("ingrese en cuatas cuotas desea pagar (hasta 12 cuotas)");
           int cuo=scanner.nextInt();
            System.out.println("LISTA DE CUOTAS CON INTERESES");
           gestor.mostrarValorDeCuotas(pr, cuo);
           
            System.out.println("Desea seguir comprando productos");
            String res=scanner.next();
            r=res.charAt(0);
            
        }
        }
    
}
    
    

