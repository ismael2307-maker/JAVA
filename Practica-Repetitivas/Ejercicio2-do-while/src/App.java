import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int numero=0,suma=0;

            do{
             System.out.println("Digite el numero");
             numero=x.nextInt();
             suma=suma+numero;    
            }while(numero!=0);
            System.out.println("La suma de los numeros es: "+suma);
            x.close();
    }
}
