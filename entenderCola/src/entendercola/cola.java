
package entendercola;
import java.util.Scanner;

public class cola {
    Nodo primero;
    Nodo ultimo;
    Scanner teclado=new Scanner(System.in);
    
    public cola(){
    primero=null;
    ultimo=null;
    }
    
    public void insertarNodo(){
    Nodo nuevo=new Nodo();
    System.out.println("ingrese el dato");
    nuevo.dato=teclado.nextInt();
    if(primero==null){
        primero=nuevo;
        primero.siguiente=null;
        ultimo=primero;
    }else{
    ultimo.siguiente=nuevo;
    nuevo.siguiente=null;
    ultimo=nuevo;
    }
    System.out.print("Nodo ingresado exitoso");
    }
}
