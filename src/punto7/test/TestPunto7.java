/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.test;

import java.util.Scanner;
import punto7.dominio.Auto;
import punto7.util.ArregloAutos;

/**
 *
 * @author Alvaro
 */
public class TestPunto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        Auto auto1 = new Auto("abc123", "Chevrolet", "camaro", "blanco", "diesel");
        Auto auto2 = new Auto("def456", "Peugeot", "907", "negro", "diesel");
        Auto auto3 = new Auto("ghi789", "Renault", "Egeus", "azul", "diesel");
        Auto auto4 = new Auto("jkl123", "Hyundai", "Tucson", "gris", "diesel");

        ArregloAutos autos = new ArregloAutos(4);
        autos.getAutos()[0] = auto1;
        autos.getAutos()[1] = auto2;
        autos.getAutos()[2] = auto3;
        autos.getAutos()[3] = auto4;

        autos.mostrarAutos();
        char resp;

        do {

            System.out.println("Decea modificar algun valor? si/no");
            String respuesta = entrada.nextLine();
            resp = respuesta.charAt(0);

            if (resp == 's' || resp == 'S') {
                autos.modificarValores();
            }
            autos.mostrarAutos();
        } while (resp == 's' || resp == 'S');

    }

}
