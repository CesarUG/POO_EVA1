/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;
import Paquete1.ClaseA;
/**
 *
 * @author Cesar
 */
public class ClaseE {
    public int publicaE;
    int defaultE;
    private int privateE;
    public void prueba(){
    ClaseA objA = new ClaseA();
      //objA.publicaA;Visibles
      //objA.defaultA;
             
     //ClaseB objB = new ClaseB();No es visible
     //objB.publicaB; 
     //objB.defaultB;
     ClaseC objC = new ClaseC();
    }
}
class ClaseF{
    public int publicaF;
    int defaultF;
    private int privateF;
}