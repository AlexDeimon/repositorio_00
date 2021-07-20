package matriz1;
import java.util.* ;
public class Matriz1 {
    private Scanner leer;
    private int [][]mat;
    public void cargar(){
    leer=new Scanner(System.in);
    mat=new int[3][4];
    for(int f=0;f<3;f++){
        for(int c=0;c<4;c++){
        System.out.print("Ingrese numero: ");
        mat[f][c]=leer.nextInt();
        }
    }
    }
    public void sumar(){
    int suma;
    suma=0;
    for(int f=0;f<3;f++){
        for(int c=0;c<4;c++){
        suma=mat[f][c]+suma;
        }
    }System.out.println("El total de la suma es: "+suma);
    }
    public void esquinas(){
    
    }
    
    public void imprimir(){
    for(int f=0;f<3;f++){
        for(int c=0;c<4;c++){
        System.out.print(mat[f][c]+" ");
        }
        System.out.println();
    }
    }
    
    

    public static void main(String[] args) {
    Matriz1 pv=new Matriz1();
    pv.cargar();
    pv.imprimir();
    pv.sumar();
    pv.esquinas();
    }
}