/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_static_3;

/**
 *
 * @author Cesar
 */
public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Example.valor);
        Example.valor++;
        System.out.println(Example.valor);
        ExampleObjetos obj = new ExampleObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
        ExampleObjetos obj2 = new ExampleObjetos();
        System.out.println(obj2.valor); 
        
      
    }
    
}

class Example{
  public static int valor= 100;
}

class ExampleObjetos{
  public int valor=100;
}