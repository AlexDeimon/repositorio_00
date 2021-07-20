package sueldos;
import java.util.Scanner;
public class Sueldos {
    private int[] sueldosAM,sueldosPM;
    private Scanner leer;
    public void cargarSueldosMañana(){
        leer=new Scanner(System.in);
        sueldosAM=new int[4];
        System.out.println("SUELDOS DE LOS EMPLEADOS DEL TURNO DE LA MAÑANA");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese el sueldo del empleado: ");
            sueldosAM[f]=leer.nextInt();
        }	
    }
    public void cargarSueldosNoche(){
        leer=new Scanner(System.in);
        sueldosPM=new int[4];
        System.out.println("SUELDOS DE LOS EMPLEADOS DEL TURNO DE LA NOCHE");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese el sueldo: ");
            sueldosPM[f]=leer.nextInt();
        }	
    }
    public void imprimirSueldos(){
        int totalAM,totalPM;
        totalAM=sueldosAM[0]+sueldosAM[1]+sueldosAM[2]+sueldosAM[3];
        totalPM=sueldosPM[0]+sueldosPM[1]+sueldosPM[2]+sueldosPM[3];
        System.out.println("LOS SUELDOS DE LOS EMPLEADOS DE LA MAÑANA SON:");
        for(int f=0;f<4;f++) {
            System.out.println(sueldosAM[f]+"$");
        }
        System.out.println("EL GASTO TOTAL EN LOS SUELDOS DE LOS EMPLEADOS DE LA MAÑANA ES DE: "+totalAM+"$");
        System.out.println("LOS SUELDOS DE LOS EMPLEADOS DE LA NOCHE SON:");
        for(int f=0;f<4;f++) {
            System.out.println(sueldosPM[f]+"$");
        }
        System.out.println("EL GASTO TOTAL EN LOS SUELDOS DE LOS EMPLEADOS DE LA NOCHE ES DE:"+totalPM+"$");
    }       
    public static void main(String[] args) {
       Sueldos pv=new Sueldos();
       pv.cargarSueldosMañana();
       pv.cargarSueldosNoche();
       pv.imprimirSueldos();
    }
    }