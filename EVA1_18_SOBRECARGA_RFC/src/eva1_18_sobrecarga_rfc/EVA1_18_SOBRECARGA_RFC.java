/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga_rfc;

/**
 *
 * @author Cesar
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rfc = generarRFC("CESAR","URIAS", "GONZALEZ",2004,7,21);
        System.out.println(rfc);
    }
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
        String apP1 = apPat.charAt(0)+"";
        String apP2 = apPat.charAt(1)+  "";
        String apM = apMat.charAt(0)+"";
        String nom = nombre.charAt(0)+  "";
        String rfc = apP1+apP2 + apM + nom +año+mes+dia+"";
        return rfc;
    }
    // SOBRE CARGAR PARA LOS CASOS:
    // FALTE UN APELLIDO------> SUSTITUIR POR X
    // FALTN AMBOS APELLIDOS----->SUSTITUIR XX
    
}
