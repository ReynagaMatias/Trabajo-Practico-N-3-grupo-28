/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.utils;

import java.util.ArrayList;
import punto5.dominio.Circulo;

/**
 *
 * @author Alejandro
 */
//esta es la clase gestorcirculo el cual se encargara de crear el array listo y poder agregar dentro de el los objetos de tipo Circulo
public class GestorCirculo {

    ArrayList<Circulo> circulos = new ArrayList();//definicion del ArrayList
//constructor por defecto
    public GestorCirculo() {
    }
//getters y setters
    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
//este metodo es para agregar objetos del tipo Circulo al arrayList definido anteriormente
    public void agregarCirculo(Circulo circulo) {
        circulos.add(circulo);
    }
//este metodo muestra los circulos solamente recorre el ArrayList y muestra el radio del circulo la superficie
    public void mostrarCirculos() {
        for (int i = 0; i < circulos.size(); i++) {
            System.out.println("El radio del circulo es: " + circulos.get(i).getRadio() + ". La superficie del circulo es: " + circulos.get(i).calcularSuperficie());
        }
    }
}
