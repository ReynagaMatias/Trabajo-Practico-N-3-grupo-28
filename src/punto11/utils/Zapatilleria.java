/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.utils;

import java.util.ArrayList;
import punto11.dominio.Zapatilla;

/**
 *
 * @author Alejandro
 */
//la clase zapatilleria funcionara como nuestro gestor de zapatillas
public class Zapatilleria {
    //aqui se crea el ArrayList
    private ArrayList<Zapatilla> zapatillas = new ArrayList();
//sus getters y setters
    public ArrayList<Zapatilla> getZapatilla() {
        return zapatillas;
    }

    public void setZapatilla(ArrayList<Zapatilla> zapatilla) {
        this.zapatillas = zapatilla;
    }

    public Zapatilleria() {
    }
    //el metodo que nos permitira agregar zapatillas al arrayList este metodorecibe un objeto de tipo Zaptilla
    public void agregarZapatilla(Zapatilla zapatilla){
        zapatillas.add(zapatilla);
    }
    //este metodo solamente recorrera el ArrayList y mientras recorre muestra Los atributos de las zapatillas
    public void mostrar(){
        for(int i = 0; i < zapatillas.size();i++){
            System.out.println("La zapatilla es: "+zapatillas.get(i).getMarca()+" zapatilla original? : "+zapatillas.get(i).getOriginal());
        }
    }
}
