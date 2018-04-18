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
//en esta clase se manejara las estructuras para almacenar Rectangulos
public class GestorRectangulo {
    //se define el ArrayList de rectangulos para poder almacenarlos
    private ArrayList<Rectangulo> rectangulos = new ArrayList();
//los respectivos getters y setters
    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }
//aqui tenemos el metodo agregarRectangulos que permite agregar rectangulos al ArrayList
    public void agregarRectangulo(Rectangulo rectangulo) {
        this.rectangulos.add(rectangulo);
    }
//este es el constructor en el cual creamosl los rectangulos con sus respectivos atributos
    public GestorRectangulo() {
        //creamos un rectangulo de tipo Rectangulo y agregamos y le damos valores a esto lo llamamos agregar estaticamente ya que no se le pide nada al usuario
        Rectangulo rectangulo;
        rectangulos.add(rectangulo = new Rectangulo(6, 4, 20, 24));
        rectangulos.add(rectangulo = new Rectangulo(7, 5, 24, 45));
        rectangulos.add(rectangulo = new Rectangulo(6, 5, 22, 30));
        rectangulos.add(rectangulo = new Rectangulo(5, 2, 14, 10));
    }
//este metodo solamente muestra recorre el arrayList y muestra la base la altura y sus demas atributos del rectangulo
    public void mostrarArrayList() {
        for (int i = 0; i < rectangulos.size(); i++) {
            System.out.println("La base del rectangulo "+i+" es: "+rectangulos.get(i).getBase()+". La altura del rectangulo "+i+" es:"+rectangulos.get(i).getAltura()+". El perimetro del rectangulo "+i+" es: "+rectangulos.get(i).getPerimetro()+". La superficie del rectagulo "+i+" es: "+rectangulos.get(i).getSuperficie());            
        }
    }
    //este metodo nos perimtite eliminar rectangulos del ArrayList
    public void eliminarRectangulo(int indice){
        rectangulos.remove(indice);
    }
}
