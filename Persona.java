/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class Persona {
    private String name;
    private String lastNames;
    private int age;
    private boolean estadoCivil;
    
   //Métodos: Comportamiento
   // lectura y escitura de atributos:
   // Métodos get --> leer, método set -->
   /* METODO
    modificador valor de retorno nombre (argumentos){implementación}
    */ 
   public String getName(){
       return name;
   }
   public void setName(String valor){
       name= valor;
   }
}
