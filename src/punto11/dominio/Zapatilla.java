/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.dominio;

/**
 *
 * @author Alejandro
 */
public class Zapatilla {
    private String marca;
    private Boolean original;

    public Zapatilla() {
    }
    
    public Zapatilla(String marca, Boolean original) {
        this.marca = marca;
        this.original = original;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }
    
    
}
