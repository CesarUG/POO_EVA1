/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author Cesar
 */
public class EVA1_5_CIRCULO {

    public static void main(String[] args) {
        Class_circle Circle1 = new Class_circle();
           Circle1.setRadio(4.5);
           Circle1.ObtenerArea();
           Circle1.ObtenerPerimetro();
           Circle1.ImprimirDatos();
        //Scanner sc = new Scanner();
       
        System.out.println("---------------");
        Class_circle Circle2 = new Class_circle(25);
         Circle2.ObtenerArea();
         Circle2.ObtenerPerimetro();
         Circle2.ImprimirDatos();
         
      
    }
   
}
