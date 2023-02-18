
package com.mycompany.eva1_6_automovil;


public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
       //Atributos
       Car car1 = new Car();
       car1.setBrand("BMW");
       car1.setModel("X5");
       car1.setYear(2022);
       car1.setOwner("Pedro Papas");
       car1.setPlacas("B78A45");
       
       //Data
       System.out.println("---Datos del automovil--- ");
       System.out.println("Marca: "+car1.getBrand()+ " modelo "+car1.getModel());
       System.out.println("Año: "+car1.getYear());
       System.out.println("Placas: "+car1.getPlacas());
       System.out.println("Dueño: "+car1.getOwner());
       car1.ObtenerAdeudos();
       
       //CARRO 2
       Car car2 = new Car("JAC","FRISON T8", "VGTA777", "Samuel De Luque", 2022);
         System.out.println("---Datos del automovil--- ");
       System.out.println("Marca: "+car2.getBrand()+ " modelo "+car2.getModel());
       System.out.println("Año: "+car2.getYear());
       System.out.println("Placas: "+car2.getPlacas());
       System.out.println("Dueño: "+car2.getOwner());
       car2.ObtenerAdeudos();
    }
}
