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
public class Rectangulo {
    private Punto punto1 = new Punto();
    private Punto punto2 = new Punto();
    private Punto punto3 = new Punto();
    private Punto punto4 = new Punto();
    private double base;
    private double altura;
    
    public Rectangulo(){
    }

    public Rectangulo(Punto punto1, double base, double altura) {
        this.punto1 = punto1;
        this.base = base;
        this.altura = altura;
    }
    
    public void calcularPunto2(){
        punto2.setX(punto1.getX());
        punto2.setY(punto1.getY() + altura) ;
    }
    
    public void calcularPunto3(){
        punto3.setX(punto1.getX() + base);
        punto3.setX(punto1.getY() + altura);
    }
    
    public void calcularPunto4(){
        punto4.setX(punto1.getX() + base);
        punto4.setY(punto1.getY());
    }
    
    public double calcularPerimetro(){
        return (base * 2 + altura * 2);
    }
    
    public double calcularSuperficie(){
        return (base * altura);
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public Punto getPunto4() {
        return punto4;
    }

    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
