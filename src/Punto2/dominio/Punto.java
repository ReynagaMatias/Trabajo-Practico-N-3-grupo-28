/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.dominio;

/**
 *
 * @author Alejandro
 */

//esta es la clase punto que solamente tiene 2 atributos
public class Punto {
    private double x;
    private double y;
//tiene su respectuvo constructor por defecto 
    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
//los getters y setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
