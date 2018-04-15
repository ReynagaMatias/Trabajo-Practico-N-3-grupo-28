/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.test;

import java.util.Scanner;
import punto11.dominio.Zapatilla;
import punto11.utils.Zapatilleria;

/**
 *
 * @author Alejandro
 */
public class TestPunto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zapatilleria zapatilleria = new Zapatilleria();
        Zapatilla zapatilla = new Zapatilla();
        Scanner teclado = new Scanner(System.in);
        char resp = 'S';
        while (resp == 'S'|| resp== 's') {
            System.out.println("Ingrese la marca de la zapatilla");
            String marca = teclado.next();
            System.out.println("Es original? ");
            boolean original = teclado.nextBoolean();
            zapatilla.setMarca(marca);
            zapatilla.setOriginal(original);
            zapatilleria.agregarZapatilla(zapatilla);
            zapatilla = new Zapatilla();
            zapatilleria.mostrar();
            System.out.println("Desea agregar otra zapatilla?");
            String resultado = teclado.next();
            resp = resultado.charAt(0);
        }
    }

}
