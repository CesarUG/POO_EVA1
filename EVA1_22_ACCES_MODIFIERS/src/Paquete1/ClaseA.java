/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author Cesar
 */
public class ClaseA {
    public int publicaA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        ClaseB objB = new ClaseB();
       // objB.publicaB; Atributso visibles
       //objB.defaultB;
      
       ClaseC objC = new ClaseC();
      // objC.publicaC; atributos visibles
      //objC.publicaC;
      
      //Clase D es default en otro archivo pero está en el mismo paqute
      ClaseD objD = new ClaseD();
      //objD.publicaD; Atributos visibles
      //objD.defaultD;
      
      //Clase E está en otro paquete
      ClaseE objE= new ClaseE();
      //Hay que agregar la clasula "import"
      //objE.publicaE; Solo se ve el atributo 
      
     //ClaseF es default y es invisible, para las clases de este paquete1   
     // ClaseF objF = new ClaseF();
    }
}

class ClaseB{
     public int publicaB;
    int defaultB;
    private int privateB;
}
