package arbolbinarioordenado;
import java.util.Scanner;
public class ArbolBinarioOrdenado {
    
    static class Nodo{
        int info;
        Nodo izq, der;
      }
    
    static Nodo raiz;
    static int info;
    static Scanner objeto2=new Scanner(System.in);
    
    public ArbolBinarioOrdenado() {
        raiz=null;
      }
    
    public static void main(String[] args) {
        int now;
        Scanner objeto1=new Scanner(System.in);
        do{
            System.out.println("1. Insertar Nodo");
            System.out.println("2. Eliminar Nodo");
            System.out.println("3. Mostrar arbol");
            System.out.println("4. Salir");
            System.out.println();
            System.out.print("INGRESE UNA OPCION:");
            now=objeto1.nextInt();
            if(now>=1&& now<=4){
                switch(now){
                    case 1:insertar();break;
                    //case 2:eliminar();break;
                    case 3:imprimir();break;
                    case 4:System.out.println("EL PROGRAMA HA TERMINADO");
                }
            }else
                System.out.println(now+" NO ES UN VALOR ENTRE 1 Y 4" );
            }while(now!=4);
    }
    
    public static void insertar (){
        Nodo nuevo=new Nodo();
        System.out.print("Ingrese Nodo: ");
        nuevo.info=objeto2.nextInt();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null)
            raiz = nuevo;
        else
        {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null)
            {
                anterior = reco;
                if (info < reco.info)
                    reco = reco.izq;
                else
                    reco = reco.der;
            }
            if (info < anterior.info)
                anterior.izq = nuevo;
            else
                anterior.der = nuevo;
        }
    }
    
    private static void imprimirPre (Nodo reco){
        if (reco != null){
            System.out.print(reco.info + " ");
            imprimirPre (reco.izq);
            imprimirPre (reco.der);
        }
    }
    
    private static void imprimirIn(Nodo reco){
        if (reco != null)
        {
            imprimirIn (reco.izq);
            System.out.print(reco.info + " ");
            imprimirIn (reco.der);
        }
    }
    
    private static void imprimirPost(Nodo reco){
        if (reco != null){
            imprimirPost (reco.izq);
            imprimirPost (reco.der);
            System.out.print(reco.info + " ");
        }
    }
    
    public static void imprimir(){
    System.out.print("Preorden: ");
    imprimirPre(raiz);
    System.out.print("Inorden: ");
    imprimirIn(raiz);
    System.out.print("Postorden: ");
    imprimirPost(raiz);
    System.out.println();
    }
}