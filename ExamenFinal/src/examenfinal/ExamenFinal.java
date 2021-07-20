//Diego Alejandro Sandoval Fernandez
package examenfinal;
import java.util.*;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class ExamenFinal{
    public  int distancia[] = new int[20];
    public  static int costo[][] = new int[20][20];
   
    public void Dijkstra(int nodos,int origen){//Void Dijkstra tomado y modificado de https://codispatch.blogspot.com/2015/12/java-program-implement-dijkstras-single-source-shortest-path-algorithm.html
        int walking[] = new int[nodos+1];
        int q,minpos=1,w,e,minimum;
        for(q=1;q<=nodos;q++){
            walking[q]=0;
            this.distancia[q]=this.costo[origen][q];
        }
        e=2;
        while(e<=nodos){
            minimum=99;
            for(w=1;w<=nodos;w++){
                if(this.distancia[w]<minimum && walking[w]!=1){
                    minimum=this.distancia[q];
                    minpos=w;
                }
            }
            walking[minpos]=1;
            e++;
            for(w=1;w<=nodos;w++){
                if(this.distancia[minpos]+this.costo[minpos][w] < this.distancia[w] && walking[w]!=1 )
                    this.distancia[w] = this.distancia[minpos]+this.costo[minpos][w];
            }  
        }
    }
    public static void main(String args[]){// main tomado y modificado de: https://www.youtube.com/watch?v=U8U8E0QYCUc
        JTextArea nuclear= new JTextArea();
        String young= "Sitio \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10 \n";
        int extraordinary=1;
        int nodos=10,r,t,origen;
        ExamenFinal revolutions=new ExamenFinal();
        Scanner in=new Scanner(System.in);
        System.out.println("jardin botanico \t \t = 1 ");
        System.out.println("parque simon bolivar \t \t = 2");
        System.out.println("maloka \t \t \t \t = 3");
        System.out.println("biblioteca virgilio barco \t = 4");
        System.out.println("Parque enrique olaya herrera \t = 5");
        System.out.println("museo nacional \t \t \t = 6");
        System.out.println("casa antonio nariño \t \t = 7");
        System.out.println("monserrate \t \t \t = 8");
        System.out.println("museo del oro \t \t \t = 9");
        System.out.println("museo botero \t \t \t = 10");
        System.out.println("Ingrese los valores de la matriz de costos separados por un espacio ");
        for(r=1; r<=nodos; r++){
            young +=extraordinary++ + "\t";
            for(t=1; t<=nodos;t++){
                revolutions.costo[r][t]=in.nextInt();
                young +=revolutions.costo[r][t] + "\t";
            }
            young += "\n";
        }
        nuclear.setText(young);
        JOptionPane.showMessageDialog(null, nuclear);
        System.out.println("Ingrese el numero del sitio de origen dentro de los que estan en la lista: ");
        origen=in.nextInt();
        if(origen<=10 && origen>=1){
            revolutions.Dijkstra(nodos, origen);
            System.out.println("La ruta mas corta en kilometros desde el sitio numero \t"+ origen +" : \n");
            for(r=1;r<=nodos; r++){
                if(r!=origen){
                System.out.println("Al sitio numero "+ r +"\t tiene "+ revolutions.distancia[r]+" kilometros");
                }
            }
        }else
            System.out.println("Ingrese un numero del 1 al 10 para tomar de origen uno de los lugares de la lista");
}
}
/*valores de la matriz de costos:
0 2 3 3 99 99 10 99 99 99 
2 0 3 2 99 99 8 99 99 9 
3 3 0 99 7 7 7 99 99 9 
3 2 99 0 6 6 9 99 8 99 
99 99 7 6 0 2 8 4 99 99 
99 99 7 6 2 0 7 5 2 99 
10 8 7 9 8 7 0 11 6 6 
99 99 99 99 4 5 11 0 4 3 
99 99 99 8 99 2 6 4 0 1 
99 9 9 99 99 99 6 3 1 0
*/