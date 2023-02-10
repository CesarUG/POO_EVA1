/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_constructores;

/**
 *
 * @author Cesar
 */
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        //Clase CuentaBancaria
        //String numero de cuenta
        //Doble saldo
        //String cliente
      CuentaBancaria cuenta1 = new CuentaBancaria("1", 1000, "Cesar");
        cuenta1.setNomCliente("Pedro Pazcal");
        cuenta1.setNumCuenta("01258");
        cuenta1.setSaldo(1000000);
        
         System.out.println("DATOS DEL CLIENTE");
         String nombre = cuenta1.getNomCliente();
         System.out.println(nombre);
         System.out.println(cuenta1.getNumCuenta());
         System.out.println(cuenta1.getSaldo());
        
        //----
        CuentaBancaria cuenta2= new CuentaBancaria("3", 200000, "Paola Gallegos");
         System.out.println("DATOS DEL CLIENTE");
       
         System.out.println(cuenta2.getNomCliente());
         System.out.println(cuenta2.getNumCuenta());
         System.out.println(cuenta2.getSaldo());
         
          CuentaBancaria cuenta3= new CuentaBancaria();
         System.out.println("DATOS DEL CLIENTE");
       
         System.out.println(cuenta3.getNomCliente());
         System.out.println(cuenta3.getNumCuenta());
         System.out.println(cuenta3.getSaldo());
    }
}
