/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.dominio;

/**
 *
 * @author Alvaro
 */
public class Triangulo {
    private double ladoa;
    private double ladob;
    private double ladoc;
    
    public boolean verificarTriangulo(double ladoa, double ladob, double ladoc){
        boolean esTriangulo;
        if((Math.abs(ladoa - ladoc) < ladob) && (ladob < (ladoa + ladoc))){
            esTriangulo=true;
        }
        else{
            esTriangulo=false;
        }
        return esTriangulo;
    }
    
    public double calcularPerimetro(double ladoa, double ladob, double ladoc){
        double perimetro;
        perimetro=ladoa +ladob + ladoc;
        return perimetro;
    }

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    public double getLadoc() {
        return ladoc;
    }

    public void setLadoc(double ladoc) {
        this.ladoc = ladoc;
    }
    
    
    
}
