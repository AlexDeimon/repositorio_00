//Diego Alejandro Sandoval Fernandez
package corte2;
import java.util.Scanner;
public class Corte2 {
    
    static class Nodo{
        Object bang;
        Nodo ball;
    }
    
    static Nodo first;
    static Nodo last;
    static Nodo first1;
    static Nodo last1;
    static Nodo first2;
    static Nodo last2;
    
    static Scanner objeto2=new Scanner(System.in);
    static Scanner objeto3=new Scanner(System.in);
    
    static int wall;
    public static int wall(){
        return wall;
    }
    
    static int revolution;
    
    public Corte2(){
        first=null;
        last=null;
        first1=null;
        last1=null;
        first2=null;
        last2=null;
        wall=0;
    }
    
    public static void main(String[] args) {
        int now;
        Scanner objeto1=new Scanner(System.in);
        do{
            System.out.println("1. Ingreso de clientes");
            System.out.println("2. Eleccion de Caja 1 o Caja 2");
            System.out.println("3. Mostrar los clientes atendidos por caja");
            System.out.println("4. Cantidad de clientes en Caja 1 y Caja 2");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("INGRESE UNA OPCION:");
            now=objeto1.nextInt();
            if(now>=1&& now<=5){
                switch(now){
                    case 1:IngresoDatos();break;
                    case 2:EleccionCaja();break;
                    case 3:ClientesAtendidos();break;
                    case 4:CantidadClientesCaja();break;
                    case 5:System.out.println("EL PROGRAMA HA TERMINADO");
                }
            }else
                System.out.println(now+" NO ES UN VALOR ENTRE 1 Y 5" );
            }while(now!=5);
    }
    
    public static void IngresoDatos(){//parte del void para insertar datos en cola fue tomado y enntendido de: Estructura de datos en Java - COLA - Parte 1 - Insertar Nodo y Desplegar Cola. Canal de youtube: Tutoriales de Programación Explicada
        Nodo forever=new Nodo ();
        System.out.print("DIGITE EL NUMERO DE TURNO O NOMBRE DEL CLIENTE: ");
        forever.bang=objeto2.nextLine();
        
        if(first==null){
            first=forever;
            first.ball=null;
            last=forever;
        }else{
            last.ball=forever;
            forever.ball=null;
            last=forever;
        }wall++;
        
        Nodo troubled=first;
        System.out.print("CLIENTES: ");
        while(troubled!=null){
            System.out.print(troubled.bang+" / ");
            troubled=troubled.ball;
        }
        System.out.println();
        System.out.println();
    }
    
    public static void EleccionCaja(){//parte del void para extraer fue tomado y entendido de: Tutoriales de Programacion Javaya. http://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=117&punto=&inicio=
        Object breathing = null;
        if(first!=null){
        breathing=first.bang;
            if (first==last){
                first=null;
                last=null;
            }else{
                first=first.ball;
                wall--;
            }
        }
        System.out.println("¿EL CLIENTE "+breathing+" SERÁ ATENDIDO EN LA CAJA 1 O 2?");
        revolution=objeto3.nextInt();
        
        if(revolution==1){
            Nodo forever=new Nodo ();
        forever.bang=breathing;
        if(first1==null){
            first1=forever;
            first1.ball=null;
            last1=forever;
        }else{
            last1.ball=forever;
            forever.ball=null;
            last1=forever;
        }wall++;
        }
        
        else if(revolution==2){
            Nodo ordinary=new Nodo ();
            ordinary.bang=breathing;
        if(first2==null){
            first2=ordinary;
            first2.ball=null;
            last2=ordinary;
        }else{
            last2.ball=ordinary;
            ordinary.ball=null;
            last2=ordinary;
        }wall++;
        }
        
        else if(revolution!=1 && revolution!=2){ 
            System.out.println("POR FAVOR DIGITE 1 O 2");    
        }
        System.out.println();
    }
    
    public static void ClientesAtendidos(){
        Nodo green=new Nodo();
        Nodo day=new Nodo();
        green=first1;
        System.out.print("CAJA 1: ");
        while(green!=null){
            System.out.print(green.bang+" & ");
            green=green.ball;
        }
        System.out.println(" ");
        day=first2;
        System.out.print("CAJA 2: ");
        while(day!=null){
            System.out.print(day.bang+" & ");
            day=day.ball;
        }
        System.out.println(" ");
    }
// int victory y gloria basados en: http://aprenderestructuradedatos.blogspot.com/2015/11/colas-en-java.html    
    public int victory(){
        Nodo good=new Nodo();
        int victory=wall;
        good=this.first1;
        while(good!=null)
        {
            victory++;
            good=good.ball;
        }
        System.out.println("CANTIDAD DE CLIENTES EN CAJA 1: "+victory);
        return victory;
    }

    public int gloria(){
        Nodo battle=new Nodo();
        int gloria=wall;
        battle=this.first2;
        while(battle!=null)
        {
            gloria++;
            battle=battle.ball;
        }
        System.out.println("CANTIDAD DE CLIENTES EN CAJA 2: "+gloria);
        return gloria;
 }
    
    public static void CantidadClientesCaja(){
        Corte2 end=new Corte2();
        end.victory();
        end.gloria(); 
    }
}