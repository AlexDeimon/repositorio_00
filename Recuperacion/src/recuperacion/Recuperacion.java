//Diego Alejandro Sandoval Fernandez
package recuperacion;
import java.util.Scanner;
public class Recuperacion {
    private int rec[][];
    private int q,w;
    private Scanner obj1;
    public void CargarMat(){
    obj1=new Scanner (System.in);
    System.out.print("Numero de filas y columnas de la matriz : ");
    q=obj1.nextInt();
    w=q;
    rec=new int[q][w];
    for(q=0;q<rec.length;q++){
    for(w=0;w<rec[q].length;w++){
    System.out.print("ingrese un numero : ");
    rec[q][w]=obj1.nextInt();
}
}
    System.out.println();
}
        public void imprimirMat1(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
        System.out.print(rec[q][w]+" ");
        }
        System.out.println();
    }
    System.out.println();
    }
      public void imprimirMat2(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
            if ((q==0&&w==0)||(q==0&&w==rec[q].length-1)||(q==rec.length-1&&w==0)||(q==rec.length-1&&w==rec[q].length-1)){
                System.out.print("*");
            } else {
                System.out.print(rec[q][w]+" ");
        }
    }
    System.out.println();
    }
    System.out.println();
    }   
    public void imprimirMat3(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
            if(w!=0){
                System.out.print(" * ");
            }else{
                System.out.print(rec[q][w]+" ");
            }
        }
        System.out.println();
    }
    System.out.println();
    }
        public void imprimirMat4(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
            if(q==0||q==rec.length-1){
                System.out.print(rec[q][w]+" ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();
    }
    System.out.println();
    }
         public void imprimirMat5(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
            
        System.out.print(rec[q][w]);
        }
        System.out.println();
    }
    System.out.println();
    }
          public void imprimirMat6(){
    for(q=0;q<rec.length;q++){
        for(w=0;w<rec[q].length;w++){
            if(q!=0 && q!=rec.length-1 && w!=0 && w!=rec[q].length-1){
                System.out.print(" * ");
            }else{
                System.out.print(rec[q][w]);
            }
        }
        System.out.println();
    }
    System.out.println();
    }
    public static void main(String[] args) {
        Recuperacion d=new Recuperacion();
        d.CargarMat();
        d.imprimirMat1();
        d.imprimirMat2();
        d.imprimirMat3();
        d.imprimirMat4();
        d.imprimirMat5();
        d.imprimirMat6();
    }   
}