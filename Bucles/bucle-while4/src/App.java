import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int valorInicial,valorFinal;

        System.out.println("Introduzca el valor inicial");
        valorInicial=x.nextInt();

        System.out.println("Introduzca el valor final");
        valorFinal=x.nextInt();

        while(valorInicial<=valorFinal){
          System.out.println(valorInicial);
          valorInicial++;
        }
    }
}
