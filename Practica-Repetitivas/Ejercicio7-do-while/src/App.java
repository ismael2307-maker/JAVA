import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int numero,suma=0,contador=0,promedio;

        do{
          System.out.println("Digite el valor del numero: #"+(contador+1));  
          numero=x.nextInt();
          contador++;
          suma=suma+numero;
          promedio=suma/10;
        }while(contador<10);
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El promedio es: "+promedio+ " %");
        x.close();
    }
}
