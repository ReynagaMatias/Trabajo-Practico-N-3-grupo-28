/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.dominio;

/**
 *
 * @author Alejandro
 */
//aqui se creo la clase circulo con el unico atributo que sera el radio
public class Circulo {
    private double radio;
//los constructores
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
//los gettes y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularSuperficie(){
        return 2*Math.PI*this.radio;
    }
    
}
