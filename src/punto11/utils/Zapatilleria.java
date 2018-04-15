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
public class Zapatilleria {
    private ArrayList<Zapatilla> zapatillas = new ArrayList();

    public ArrayList<Zapatilla> getZapatilla() {
        return zapatillas;
    }

    public void setZapatilla(ArrayList<Zapatilla> zapatilla) {
        this.zapatillas = zapatilla;
    }

    public Zapatilleria() {
    }
    
    public void agregarZapatilla(Zapatilla zapatilla){
        zapatillas.add(zapatilla);
    }
    
    public void mostrar(){
        for(int i = 0; i < zapatillas.size();i++){
            System.out.println("La zapatilla es: "+zapatillas.get(i).getMarca()+" zapatilla original? : "+zapatillas.get(i).getOriginal());
        }
    }
}
