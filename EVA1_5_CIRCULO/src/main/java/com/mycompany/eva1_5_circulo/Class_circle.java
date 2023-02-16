/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author Cesar
 */
public class Class_circle {
   private double radio;
   private double perimetro;
   private double area;
    
    
    
    public Class_circle(){
        radio =0;
        perimetro = 0;
        area=0;
    }
    public Class_circle(double nradio){
     radio=nradio;
    }
    // SET AND GET
    public double getRadio(){
        return  radio;
    }
    public double getPerimetro(){
    return perimetro;
            }
    public double getArea(){
     return area;
    }
    public void setRadio(double valor){
        radio=valor;
    }
   public void setArea(double valor){
        area=valor;
    }
    public void setPerimetro(double valor){
        perimetro=valor;
    }
    //METODOs/ funciones
    public void ObtenerArea(){
     area = Math.pow(radio,2)*Math.PI;
     
   
    }
    public void ObtenerPerimetro(){
     perimetro=2*Math.PI*radio;   
     
    }
    
    public void ImprimirDatos(){
    System.out.println("Datos del circulo");
    System.out.println("Radio: "+radio);
    System.out.println("Área: "+ Math.round(area*100.0)/100.0);
    System.out.println("Perimetro: "+ Math.round(perimetro*100.0)/100.0);
    }

}
 


