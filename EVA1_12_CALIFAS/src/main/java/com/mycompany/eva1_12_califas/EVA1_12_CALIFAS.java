/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

/**
 *
 * @author Cesar
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
     String cali;
     cali=Cali(95);
     System.out.println("Calificaición: "+cali);
     System.out.println("Calificaición para 70: "+Cali(70));
     Cali(100);
    }
    public static String Cali(int califa){
       /* if(cali>=91 && cali<=100){
          return "A";
          
        }else if(cali>=81 && cali<=90){
          return "B";
          
        }else if(cali>=71 && cali<=80){
           return "C";
           
        }else{
           return "D";  
        }
     */
         String resu;
       if(califa>=91 && califa<=100){
          resu="A";
          
        }else if(califa>=81 && califa<=90){
          resu="B";
          
        }else if(califa>=71 && califa<=80){
           resu="A";
           
        }else{
             resu="D";
        }
       return resu;
    }
   
}    
