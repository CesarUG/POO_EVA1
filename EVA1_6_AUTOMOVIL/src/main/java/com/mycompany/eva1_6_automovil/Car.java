/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_automovil;

/**
 *
 * @author Cesar
 */
public class Car {
    private String brand;
    private String model;
    private String placas;
    private int year;
    private String owner;
    //SET AND GET
    public void setBrand(String valorMarca){
      brand=valorMarca;
    }
    public void setModel(String valorModelo){
      model=valorModelo;
    }
    public void setPlacas(String valorPlacas){
      placas=valorPlacas;
    }
    public void setYear(int valorAño){
      year=valorAño;
    }
    public void setOwner(String valorDueño){
      owner=valorDueño;
    }
    public String getBrand(){
      return brand;
    }
    public String getModel(){
      return model;
    }
    public String getPlacas(){
      return placas;
    }
    public int getYear(){
      return year;
    }
    public String getOwner(){
    return owner;
    }
    // CONSTRRUCTORES
    //Default
    public Car(){
    brand="-----";
    model="-----";
    placas="-----";
    year=0;
    owner="-----";
    }
    //Con argumentos
    public Car(String infBrand,String infModel,String infPlacas,String infOwner,int infYear){
        brand=infBrand;
        model=infModel;
        placas=infPlacas;
        year=infYear;
        owner=infOwner;
    }
    public void ObtenerAdeudos(){
     if(year<2000)
        System.out.println("Adeudo: $1500");
     if (year>=2001 && year<=2005)
        System.out.println("Adeudo: $2000");
     if (year>=2006 && year<=2010)
        System.out.println("Adeudo: $2500");
     if (year>=2011 && year<=2015)
        System.out.println("Adeudo: $3000");
     if (year>=2016 && year<=2023)
        System.out.println("Adeudo: $4000");
     
   }
    

}