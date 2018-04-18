/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto12.utils;

/**
 *
 * @author Alejandro
 */
//la clase autor es solamente para poder definir un atributo de la clase libro ya que el libro posee autor y autor deberia ser una clase con tambien sus respectivos atributos en este caso solamente le pusimos nombre y apellido
public class Autor {
    private String nombre;
    private String apellido;
//sus respectivos contructores
    public Autor() {
    }

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
}
