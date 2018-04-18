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
//aqui esta la clase rectangulo que posee 4 atributos que son la base la altura y los 4 puntos que formaran al rectangulo
public class Rectangulo {
    private Punto punto1 = new Punto();
    private Punto punto2 = new Punto();
    private Punto punto3 = new Punto();
    private Punto punto4 = new Punto();
    private double base;
    private double altura;
    
    //posee sus constructores getters y setters
    //los constructores que posee son los contructores por defecto y el que esta constryendo los atributos
    public Rectangulo(){
    }

    public Rectangulo(Punto punto1, double base, double altura) {
        this.punto1 = punto1;
        this.base = base;
        this.altura = altura;
    }
    
    //este metodo calcula el punto2 que solamente aumenta la altura en el eje de las y para poder sacar el 2do punto
    public void calcularPunto2(){
        punto2.setX(punto1.getX());
        punto2.setY(punto1.getY() + altura) ;
    }
    
    //este metodo calcula el 3er punto aumenta la base en el eje de las x y la altura en el eje de las y
    public void calcularPunto3(){
        punto3.setX(punto1.getX() + base);
        punto3.setX(punto1.getY() + altura);
    }
    
    //este metodo calcula el punto5 aumenta la base en el eje de las x
    public void calcularPunto4(){
        punto4.setX(punto1.getX() + base);
        punto4.setY(punto1.getY());
    }
    
    //este metodo calcula el perimetro del rectangulo
    public double calcularPerimetro(){
        return (base * 2 + altura * 2);
    }
    
    //este metodo calcula la superficie del rectangulo
    public double calcularSuperficie(){
        return (base * altura);
    }

    //aqui se encuentran los getters y setters
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
