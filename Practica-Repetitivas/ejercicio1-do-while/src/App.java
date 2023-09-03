import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
         byte num1,num2;   
         do{
           System.out.println("Digite el numero 1");
           num1=x.nextByte();

           System.out.println("Digite el numero 2");
           num2=x.nextByte();


         }while(num1!=num2);
          System.out.println("Los numeros: "+num1+ " y "+num2+ " Son iguales");
        x.close();
    }
}
