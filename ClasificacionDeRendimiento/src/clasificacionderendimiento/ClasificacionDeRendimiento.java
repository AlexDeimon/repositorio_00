package clasificacionderendimiento;
import java.util.Scanner;
public class ClasificacionDeRendimiento {
    
    public void main(String[] args) {
        int x,y,z;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Digite tiempo de prueba 1: ");
        x=teclado.nextInt();
        System.out.print("Digite tiempo de prueba 2: ");
        y=teclado.nextInt();
        System.out.print("Digite tiempo de prueba 2: ");
        z=teclado.nextInt();
        if(x>=0 && x<=100){
        System.out.print("El sujeto es velocista");
        }
        if(y>=0 && y<=100){
        System.out.print("El sujeto es etc");
        }
        if(z>=0 && z<=100){
        System.out.print("El sujeto es etc");
        }
        if(x>=0 && x<=100 && y>=0 && y<=100 && z>=0 && z<=100){
        System.out.print("El sujeto es velocista");
        }
        if(x>=0 && x<=100 && y>=0 && y<=100){
        System.out.print("El sujeto es velocista");
        }
        if(x>=0 && x<=100 && z>=0 && z<=100){
        System.out.print("El sujeto es velocista");
        }
        if(y>=0 && y<=100 && z>=0 && z<=100){
        System.out.print("El sujeto es etc");
        }
        if(x>=0 && x<=100 && z>=0 && z<=100){
        System.out.print("El sujeto es etc");
        }
    }
    
}
