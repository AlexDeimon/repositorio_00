package recuperacionparcial;
import java.util.Scanner;
public class RecuperacionParcial {
    private int rec[][];
    private int q;
    int w=q;
    private Scanner obj1;
    public void CargarMat(){
    obj1=new Scanner(System.in);
    System.out.print("Numero de filas y columnas de la matriz: ");
    q=obj1.nextInt();
    rec=new int[q][w];
    for(q=0;q<rec.length;q++){
    for(w=0;w<rec[q].length;w++){
    System.out.print("ingrese un numero: ");
    rec[q][w]=obj1.nextInt();
    }
    }
    }
        public void imprimirMat1(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
        System.out.print(rec[q][w]);
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        RecuperacionParcial d=new RecuperacionParcial();
        d.CargarMat();
        d.imprimirMat1();
    }   
}
