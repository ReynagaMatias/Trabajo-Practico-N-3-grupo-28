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
public class GestorCirculo {

    ArrayList<Circulo> circulos = new ArrayList();

    public GestorCirculo() {
    }

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }

    public void agregarCirculo(Circulo circulo) {
        circulos.add(circulo);
    }

    public void mostrarCirculos() {
        for (int i = 0; i < circulos.size(); i++) {
            System.out.println("El radio del circulo es: " + circulos.get(i).getRadio() + ". La superficie del circulo es: " + circulos.get(i).calcularSuperficie());
        }
    }
}
