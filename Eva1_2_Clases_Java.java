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
public class Eva1_2_Clases_Java {

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
     System.out.println(perso1.getName);
       
    }
    
}
