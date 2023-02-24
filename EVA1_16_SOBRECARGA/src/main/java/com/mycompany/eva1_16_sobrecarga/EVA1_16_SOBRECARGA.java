/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_sobrecarga;

/**
 *
 * @author Cesar
 */
public class EVA1_16_SOBRECARGA {

    public static void main(String[] args) {
        System.out.println("Suma "+suma(4,5));
        System.out.println("Suma "+suma(4.5,5.2));
        System.out.println("Suma "+suma("Cesar"," Urías"));
        suma();
        
    }
               //firma suma(int,int)
    public static int suma(int num1, int num2){
    return num1+num2;
    } 
    //firma suma(double,double)
    public  static double suma(double num1, double num2){
    return num1+num2;
    }
    //firma suma(string,string)
     public  static String suma(String num1, String num2){
    return num1+num2;
    }
     //Firma suam()
    public static void suma(){
        System.out.println("Método sin parámetros");
    }
    public static double areaShape(double radio){
        return radio*radio*Math.PI;
    }
    public static double areaShape(double altura, double base){
        return (altura*base)/2;
    }
    public static double areaShape(double altura, double baseM, double basem){
        return ((baseM+basem)/2)*altura;
    }
}
