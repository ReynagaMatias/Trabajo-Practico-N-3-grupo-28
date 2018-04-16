/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.util;

import punto7.dominio.Auto;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class ArregloAutos {

    Scanner entrada1 = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);
    Scanner ingresarCadena=new Scanner(System.in);
    private Auto[] autos;

    public ArregloAutos() {

    }

    public ArregloAutos(int tamanioArreglo) {
        autos = new Auto[tamanioArreglo];
    }

    public void mostrarAutos() {
        
        for (int i = 0; i < autos.length; i++) {

            System.out.println("auto " + (i+1) +"\nPatente: "+autos[i].getPatente()+ "\nMarca: " + autos[i].getMarca() + "\ncolor:" + autos[i].getColor() +  "\nModelo: " + autos[i].getModelo() + "\ncolor: " + autos[i].getColor() + "\nTipo de combustible: " + autos[i].getTipoDeCombustible()+"\n");
        }

    }

    public void modificarValores() {
        int posicion, valor;
        
        do{
        System.out.println("Ingrese el numero de auto que va a modificar: ");
        for(int i=0;i<autos.length;i++){
            System.out.println((i+1)+": "+autos[i].getMarca());
        }
        posicion = entrada1.nextInt();
        
        }while(posicion < 1 || posicion > 5);
        posicion=posicion-1;
        
        
        do{
        System.out.println("Elíja el valor que va a modificar: \n1-Patente\n2-marca\n3-modelo\n4-color\n5-Tipo de Combustible");
        valor = entrada2.nextInt();
        }while(valor < 1 || valor > 6);
        valor=valor-1;
        
        
        System.out.println("Ingrese el la modificacion");
        String modificacion=ingresarCadena.nextLine();
        
        
        switch (valor) {
            case 0:
                autos[posicion].setPatente(modificacion);
                break;
            case 1:
                autos[posicion].setMarca(modificacion);
                break;
            case 2:
                autos[posicion].setModelo(modificacion);
                break;
            case 3:
                autos[posicion].setColor(modificacion);
                break;
            case 4:
                autos[posicion].setTipoDeCombustible(modificacion);
                break;
            default:
                System.out.println("No ingreso un valor correcto");
                break;

        }
        System.out.println("Valores del auto modificado: ");
        
    }

    public Auto[] getAutos() {
        return autos;
    }

    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }

     
}