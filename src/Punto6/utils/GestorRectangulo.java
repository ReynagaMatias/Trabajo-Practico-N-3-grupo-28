/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.utils;

import Punto6.dominio.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class GestorRectangulo {

    private ArrayList<Rectangulo> rectangulos = new ArrayList();

    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }

    public void agregarRectangulo(Rectangulo rectangulo) {
        this.rectangulos.add(rectangulo);
    }

    public GestorRectangulo() {
        Rectangulo rectangulo;
        rectangulos.add(rectangulo = new Rectangulo(6, 4, 20, 24));
        rectangulos.add(rectangulo = new Rectangulo(7, 5, 24, 45));
        rectangulos.add(rectangulo = new Rectangulo(6, 5, 22, 30));
        rectangulos.add(rectangulo = new Rectangulo(5, 2, 14, 10));
    }

    public void mostrarArrayList() {
        for (int i = 0; i < rectangulos.size(); i++) {
            System.out.println("La base del rectangulo "+i+" es: "+rectangulos.get(i).getBase()+". La altura del rectangulo "+i+" es:"+rectangulos.get(i).getAltura()+". El perimetro del rectangulo "+i+" es: "+rectangulos.get(i).getPerimetro()+". La superficie del rectagulo "+i+" es: "+rectangulos.get(i).getSuperficie());            
        }
    }
    
    public void eliminarRectangulo(int indice){
        rectangulos.remove(indice);
    }
}
