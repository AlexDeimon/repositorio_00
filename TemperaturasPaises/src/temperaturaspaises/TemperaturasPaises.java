//Diego Alejandro Sandoval Fernandez
package temperaturaspaises;
import java.util.Scanner;

public class TemperaturasPaises {
    private Scanner teclado;
    private Scanner leer;
    String pais[];
    int temp[];
    int promedio;
    int promedios[];
    
    public void cargar(){
        teclado=new Scanner(System.in);
        pais=new String[4];        
        leer=new Scanner(System.in);
        temp=new int[3];
        for(int p=0;p<4;p++) {
            System.out.print("DIGITE PAIS " +(p+1)+":" );
            String pais=teclado.nextLine();
            for(int t=0;t<3;t++){
                System.out.print("TEMPERATURAS:");
                temp[t]=leer.nextInt();
            }
        }System.out.println(" ");
    }
    
   public void imprimir() {
        for(int p=0;p<4;p++){
        	System.out.println("PAIS: "+pais[p]+" ");
            for(int t=0;t<3;t++) {
               System.out.println("TEMPERATURA"+(t+1)+": "+temp[t]);
            }
            System.out.println(" ");
        }    
    }
   
   public void TemperaturaTrimestral(){
       int suma;
       suma=0;
       promedio=suma/3;
       promedios=new int[4];
       for(int p=1;p<5;p++){
        for(int t=0;t<3;t++){
        suma=temp[t]+suma;
        }
        System.out.println("LA TEMPERATURA TRIMESTRAL DEL PAIS "+pais[p]+" ES: "+promedios[promedio]);
       }
   }
   
   public void TemperaturaTrimestralMayor(){
   int mayor=0;
   for(int m=0;m<4;m++){
   if(mayor<promedios[promedio]);
   mayor=promedios[promedio];
   }
   System.out.print("LA TEMPERATURA TRIMESTRAL MAYOR ES: "+promedio+" DEL PAIS: "+pais+" ");
   }
   
    public static void main(String[] args) {
        TemperaturasPaises pv=new TemperaturasPaises();
        pv.cargar();
        pv.imprimir();
        pv.TemperaturaTrimestral();
        pv.TemperaturaTrimestralMayor();
    }
}