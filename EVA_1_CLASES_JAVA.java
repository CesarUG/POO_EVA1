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
public class EVA_1_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase es la receta
        // Objeto el platillo
        // 1.- declarar  el identificador para el objeto 
        // 2.- asignar memoria con new 
        // 3.-Invocar su constructor
        // Persona () --> constructor
        // Contructor __> método
        Persona perso1 = new Persona();
       //System.out.println(perso1);
       /* 
       ESTA SECCIÓN ES INICIAMOS CON LOS
        ATRIBUTOS CON MODIFICADOR DEFAULT
       perso1.name= "Cesar";
       perso1.lastNames="Urías González";
       perso1.age= 18;
       perso1.estadoCivil = true;
       System.out.println(perso1.name);
       System.out.println(perso1.lastNames);
       System.out.println(perso1.age);
       System.out.println(perso1.estadoCivil);*/
     perso1.setName("Cesar");
     perso1.setLastName("Urias González");
     perso1.setAge(18);
     perso1.setEstadoCivil(true);
     System.out.println(perso1.getName());
     perso1.imprimirDatos();
     
     //Persona2
     Persona perso2 = new Persona();
     perso2.setName("Paola");
     perso2.setLastName("Gallegos Olmeda");
     perso2.setAge(18);
     perso2.setEstadoCivil(false);
     perso2.imprimirDatos();  
    }
    
}