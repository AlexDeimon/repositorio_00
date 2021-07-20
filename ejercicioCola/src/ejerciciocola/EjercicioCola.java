package ejerciciocola;
public class EjercicioCola {
    private Object[] cola;
    private int primero;
    private int ultimo;
    public EjercicioCola(int L){
        cola=new Object[L];
        primero=ultimo=-1;
    }
    public void llenar(Object obj1){
        if(ultimo==cola.length-1)
            System.out.println("La cola esta llena, borre datos");
        else
            cola[++ultimo]=obj1;
    }
    public Object sacar(){
        if(primero==ultimo)
        {
            System.out.println("La cola esta vacia, carge datos");
            return "Cola vacia";
        }
        else
            return cola[++primero];
    }
    public void imprimir(){
        if(primero==ultimo)
            System.out.println("La cola esta vacia");
        else if(primero==-1){
            for(int q=0;q<=ultimo;q++){
                System.out.println(cola[q]);
            }
        }
        else{
            for(int w=primero;w<=ultimo;w++){
                System.out.println(cola[w]);
            }
        }
    }
    public static void main(String[] args){
        EjercicioCola e=new EjercicioCola(5);
        e.llenar(1);
        e.llenar(2);
        e.llenar(3);
        e.llenar(4);
        e.llenar(5);
        e.imprimir();
        System.out.println(" ");
        e.sacar();
        e.sacar();
        e.imprimir();
    }
}