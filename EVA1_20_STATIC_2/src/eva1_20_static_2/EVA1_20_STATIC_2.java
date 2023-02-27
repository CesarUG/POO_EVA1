/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_static_2;

/**
 *
 * @author Cesar
 */
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int x;//Solo se puede asiganar un valor una sola vez
        x=100;
       formulasGeometria formulas = new formulasGeometria ();
       //formulas. no exites un método dentro del ojeto
       System.out.println("MI PI "+formulasGeometria.PI);
       System.out.println("Area triangulo "+formulasGeometria.areaTriangulo(15,30 ));
       System.out.println("Volumen esfera "+formulasGeometria.olumenEsfera(10));
       
    }
    
}
