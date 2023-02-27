
package eva1_20_static_2;

/**
 *
 * @author Cesar
 */
public class formulasGeometria {
   //Constante
    public static  final double PI=3.14159;
    //area
    //Triangulo
   public static double areaTriangulo(double base, double altura){
       return (base*altura)/2;
   }
   //Circulo
   public static double areaCirculo(double radio){
       return radio*radio*PI;
   }
   //PERIMETRO
   public static double PerimetroCirculo(double radio){
       return PI*(radio*2);
   }
   
   //volumen esfera
   public static double olumenEsfera(double radio){
       return (4.0/3.0)*PI*(radio*radio*radio);
   }
}
