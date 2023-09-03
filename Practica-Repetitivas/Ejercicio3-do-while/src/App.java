import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       int contador=0,num,suma=0;

       do{
         System.out.println("Digite el numero");
         num=x.nextInt();
         contador++;
         suma=suma+num;
       }while(contador<10);
       System.out.println("La suma es: "+suma);
       x.close();
    }
}
