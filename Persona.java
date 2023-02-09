/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_clases_java;

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
   
   public String getLastName(){
       return lastNames;
   }
   public void setLastName(String valor){
       lastNames= valor;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int valor){
       age=valor;
   }
   public boolean getEstadoCivil(){
       return estadoCivil;
   } 
   public void setEstadoCivil(boolean valor){
       estadoCivil= valor;
   }
   public void imprimirDatos(){
     System.out.println("-----------------");
     System.out.println("Datos Almacenados");
     System.out.println("Nombre Completo: "+name+" "+lastNames);
     System.out.println("Edad: "+age);
     if(estadoCivil= true)
         System.out.println("Estado Civil: casado");
     else 
         System.out.println("Estado civil: Soltero");
   }
}
