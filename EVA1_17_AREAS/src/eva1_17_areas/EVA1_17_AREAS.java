/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_areas;

/**
 *
 * @author Cesar
 */
public class EVA1_17_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Circulo "+areaShape(4));
       System.out.println("Trinagulo "+areaShape(5,10));
       System.out.println("Trapecio "+areaShape(10,24,12));
    }
    public static double areaShape(double radio){
        return (radio*radio*Math.PI);
    }
    public static double areaShape(double altura, double base){
        return (altura*base)/2;
    }
    public static double areaShape(double altura, double baseM, double basem){
        return ((baseM+basem)/2)*altura;
    }
}
