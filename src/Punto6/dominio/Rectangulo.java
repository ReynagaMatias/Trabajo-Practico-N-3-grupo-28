/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.dominio;

/**
 *
 * @author Alejandro
 */
//la clase rectangulo posee sus atributos 
public class Rectangulo {
    private double base;
    private double altura;
    private double perimetro;
    private double superficie;
//sus contrusctores
    public Rectangulo(double base, double altura, double perimetro, double superficie) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.superficie = superficie;
    }
    
    public Rectangulo(){
        
    }
//los getters y setters
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    //La clase rectangulo tiene los metodos calcular superficie y calcular perimetro ya que cuando se desea saber el erimetro del triangulo el propio rectangulo deberia saber sus atributos que posee
    public double calcularSuperficie(){
        return (base *2 +altura*2);
    }
    public double calcularPerimetro(){
        return (base * altura);
    }
    
}
