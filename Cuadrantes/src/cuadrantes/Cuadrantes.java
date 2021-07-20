package cuadrantes;
import java.util.*;
public class Cuadrantes {
    int x,y;
    public void cargarValores(){
        Scanner leer=new Scanner(System.in);
            System.out.print("Ingrese x:");
            x=leer.nextInt();
            System.out.print("Ingrese y:");
            y=leer.nextInt();
            }
    public void imprimirCuadrante(){
    if (x>0 && y>0){
        System.out.println("La coordenada esta en el primer cuadrante");
    }
    else if (x<0 && y>0){
        System.out.println("La coordenada esta en el segundo cuadrante");
    }
    else if (x<0 && y<0){
        System.out.println("La coordenada esta en el tercer cuadrante");
    }
    else if (x>0 && y<0){
        System.out.println("La coordenada esta en el cuarto cuadrante");
    }
    else if (x==0 && y==0){
        System.out.println("La coordenada esta en el origen");
    }
}

    public static void main(String[] args) {
    Cuadrantes cuadrante;
    cuadrante=new Cuadrantes();
    cuadrante.cargarValores();
    cuadrante.imprimirCuadrante();
    }
}