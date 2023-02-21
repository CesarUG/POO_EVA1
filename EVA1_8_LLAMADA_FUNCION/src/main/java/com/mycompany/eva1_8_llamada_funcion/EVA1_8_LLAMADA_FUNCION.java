/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_llamada_funcion;

/**
 *
 * @author Cesar
 */
public class EVA1_8_LLAMADA_FUNCION {

    public static void main(String[] args) {
        System.out.println("Inicia MAIN");
        A();
        System.out.println("Termina MAIN");
    }
    public static void A(){
     System.out.println("Inicia A");
     B();
     System.out.println("Termina A");
    }
    public static void B(){
     System.out.println("Inicia B");
     System.out.println("Termina B");
    }
}
