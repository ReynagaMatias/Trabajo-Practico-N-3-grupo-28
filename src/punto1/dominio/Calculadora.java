/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.dominio;

/**
 *
 * @author Alvaro
 */
public class Calculadora {
     private Punto unPunto = new Punto();
    private Punto segundoPunto = new Punto();

    public Calculadora() {
       
    }

    
    
    public double obtenerDistancia(){
        return Math.sqrt(Math.pow((segundoPunto.getX()-unPunto.getX()), 2)+Math.pow((segundoPunto.getY()-unPunto.getY()), 2));
    }

    public Calculadora(Punto unPunto,Punto segundoPunto) {
        this.unPunto=unPunto;
        this.segundoPunto=segundoPunto;
        
    }
    
    public Punto getUnPunto() {
        return unPunto;
    }

    public void setUnPunto(Punto unPunto) {
        this.unPunto = unPunto;
    }

    public Punto getSegundoPunto() {
        return segundoPunto;
    }

    public void setSegundoPunto(Punto segundoPunto) {
        this.segundoPunto = segundoPunto;
    }
    
}
