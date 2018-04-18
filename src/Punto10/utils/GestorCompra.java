
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
    public void mostrarListaDeProductos(){
        for(int i=0;i<productos.size();i++){
            System.out.println("Codigo: " + productos.get(i).getCodigo()+" Nombre: " + productos.get(i).getNombre()+" Precio: "+productos.get(i).getPrecio());
        }
    }
    public void mostrarValorDeCuotas(double pr,int cuo){
       double interes=1.5; 
       double totalCuo= pr/cuo;
       double total=0;
       double [] cuota = new double [12];
       
       for (int i=0; i<cuo;i++){
           
           totalCuo = totalCuo + (pr* (interes * i) / 100);
           cuota[i]=totalCuo;
           System.out.println(i+" cuota: "+cuota[i]);
           

            totalCuo = pr / cuo;
            total=total + totalCuo;

            
            }
        System.out.println("La suma total a pagar es :" + total);
          
       }
}
