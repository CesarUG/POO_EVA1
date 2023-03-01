
 
package Paquete1;
import Paquete2.ClaseE;
/**
 *
 * @author Cesar
 */
public class ClaseC {
    public int publicaC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
     ClaseA objA = new ClaseA();
      //objA.publicaA;Visibles
      //objA.defaultA;
             
     ClaseB objB = new ClaseB();
     //objB.publicaB; Visibles
     //objB.defaultB;
     ClaseD objD = new ClaseD();
     //objD.publicaD;
     //objD.publicaD;
     ClaseE objE = new ClaseE();
     //objE.publicaE;
   
     
     //ClaseF objF = new ClaseF();
     
    }
}
class ClaseD{
    public int publicaD;
    int defaultD;
    private int privateD;
}
