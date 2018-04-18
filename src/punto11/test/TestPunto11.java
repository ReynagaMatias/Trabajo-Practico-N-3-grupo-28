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
        //se instanciara las clases necesarias
        Zapatilleria zapatilleria = new Zapatilleria();
        Zapatilla zapatilla = new Zapatilla();
        Scanner teclado = new Scanner(System.in);
        char resp = 'S';
        while (resp == 'S'|| resp== 's') {
            //se perida el ingreso de los datos la marca y si es original (dato importante si es original se ingresa atrabezde un booleano)
            System.out.println("Ingrese la marca de la zapatilla");
            String marca = teclado.next();
            System.out.println("Es original? ");
            boolean original = teclado.nextBoolean();
            //se eviara al objeto zapatilla los datos ingresaods que son los atributs de esta clase
            zapatilla.setMarca(marca);
            zapatilla.setOriginal(original);
            //se agregara
            zapatilleria.agregarZapatilla(zapatilla);
            //se creara un nuevo objeto zapatilla para poder reusar la variable nuevamente 
            zapatilla = new Zapatilla();
            //se mostrara la tabla de zapatillas
            zapatilleria.mostrar();
            //se preguntara al usuario si desea agregar otra zapatilla 
            System.out.println("Desea agregar otra zapatilla?");
            String resultado = teclado.next();
            resp = resultado.charAt(0);
        }
    }

}
