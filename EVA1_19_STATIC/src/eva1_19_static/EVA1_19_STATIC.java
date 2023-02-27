
package eva1_19_static;

/**
 *
 * @author Cesar
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PI "+ Math.PI);
        System.out.println("PI "+ Math.random());
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.OtroSaludo();
        
       // Saludo2();//Si no es estatico, y no se ha creado  un objeto, el método  no exite       
    }
    public void Saludo2(){
        System.out.println("HOLAAA");
    }
}

class Utilerias{
    //Este método existe cuando se crea un objeto de la clase
    // Solo se usa a través de un objeto
    public void Saludo(){
        System.out.println("hola");
}
    //Este método existe en el momentob que el programa  inicia su ejecución 
    //No necesita que se cree un objeto  de la clase para poder utilizarlo
    //Se usa a tra´ces de la clase
    public static void OtroSaludo(){
        System.out.println("hola");
}
}
class Example{
      
}