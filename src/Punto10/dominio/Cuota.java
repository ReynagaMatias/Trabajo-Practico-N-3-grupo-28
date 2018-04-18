/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.dominio;

/**
 *
 * @author User
 */
public class Cuota {
    private int numeroDeCuota;
    private String descripcion;
    private double valorDeCuota;

    public Cuota(int numeroDeCuota, String descripcion, double valorDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
        this.descripcion = descripcion;
        this.valorDeCuota = valorDeCuota;
    }

    public Cuota() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorDeCuota() {
        return valorDeCuota;
    }

    public void setValorDeCuota(double valorDeCuota) {
        this.valorDeCuota = valorDeCuota;
    }
    
    
}
