package tablamultiplicar;
import java.util.*;
public class TablaMultiplicar {
    public void cargarValor(){
    Scanner leer=new Scanner(System.in);
        int valor;
        do{
        System.out.print("Ingrese el valor de la tabla a generar: ");
        valor=leer.nextInt();
        if(valor!=-1){
        calcular(valor);
        }
        }while(valor!=-1);
    }
    public void calcular(int v){
        for(int i=0;i<=10;i++){
            System.out.println(i +"x"+v+"="+i*v);
        }
    }
    
    public static void main(String[] args){
TablaMultiplicar tabla;
tabla=new TablaMultiplicar();
tabla.cargarValor();
}
}
