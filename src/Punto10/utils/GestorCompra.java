
package Punto10.utils;

import java.util.ArrayList;
import Punto10.dominio.Producto;


/**
 *
 * @author Ines
 */
public class GestorCompra {
    ArrayList<Producto> productos =new ArrayList();
    

    public GestorCompra() {
//        Producto producto;
//        productos.add(producto=new Producto("ARW121", "Musculosa Darling", 300.00));
//        productos.add(producto=new Producto("ARW989", "Zapatillas Topper", 400.00));
//        productos.add(producto=new Producto("ARW237", "Remera Nike", 150.23));
//        productos.add(producto=new Producto("ARW808", "Medias Topper", 90.34));
//        productos.add(producto=new Producto("ARW231", "Jeans Clásico", 543.12));   
//        productos.add(producto=new Producto("ARW876", "Mochila Key Whoss", 210.46));
//        productos.add(producto=new Producto("ARW289", "Campera Algodón", 990.42));
        
     
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

 
    public void agregarProducto(Producto productos){
      this.productos.add(productos);
    }
    // Este metodo muestra los productos que se ingresan
    public void mostrarListaDeProductos(){
        for(int i=0;i<productos.size();i++){
            System.out.println("Codigo: " + productos.get(i).getCodigo()+" Nombre: " + productos.get(i).getNombre()+" Precio: "+productos.get(i).getPrecio());
        }
    }
    
    //este metodo muestra las cantidad de cuotas que se elijio y el precio a pagar en cada cuota
    public void mostrarValorDeCuotas(double pr,int cuo){
       double interes=1.5; 
       double totalCuo= pr/cuo;
       double valorCuota=0;
       double total=0;
       double [] cuota = new double [12];
       
       for (int i=0; i<cuo;i++){
           
           valorCuota = totalCuo + (pr* (interes * i) / 100);
           cuota[i]=valorCuota;
           System.out.println(i+" cuota: "+cuota[i]);
            
            total=total + valorCuota;

            
            }
        System.out.println("La suma total a pagar es :" + total);
          
       }
}
