package cuadrado;
import java.util.*;
public class Cuadrado {
    int lado, perimetro,superficie;
    public void cargarValorLado(){
    Scanner leer=new Scanner(System.in);
    System.out.print("Ingrese el valor del lado: ");
            lado=leer.nextInt();
}
    public void Perimetro(){
    perimetro=lado*4;
    	System.out.print("El perímetro del cuadrado con lado " +lado+ " es:" );
    	System.out.println(perimetro);
    }
    public void Superficie(){
    superficie=lado*lado;
    System.out.print("La superficie del cuadrado con lado "+lado+" es: ");
    System.out.println(superficie);
    }
    public static void main(String[] args) {
       Cuadrado valor;
       valor=new Cuadrado();
       valor.cargarValorLado();
       valor.Perimetro();
       valor.Superficie();
    }
}

