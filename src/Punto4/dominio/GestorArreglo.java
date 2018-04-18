/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.dominio;

/**
 *
 * @author ribeiro
 */
public class GestorArreglo {
    int [] num = new int [10];


    public GestorArreglo() {
        
    }
    
    

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
    
    public void mostrarVector(){
    for (int i=0; i<num.length;i++){
             System.out.println("["+i+"]" + num[i]);
         }
    
    }
    
}
