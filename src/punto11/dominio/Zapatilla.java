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
//en la clase zapatilla solamente tendremos los atributos marca y iriginal
public class Zapatilla {
    private String marca;
    private Boolean original;
//sus constructores
    public Zapatilla() {
    }
    
    public Zapatilla(String marca, Boolean original) {
        this.marca = marca;
        this.original = original;
    }
    
    //getters y setters

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
