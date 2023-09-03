import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int num=1,ValorFinal;

         System.out.println("Digite el valor final");
          ValorFinal=x.nextInt();
          System.out.println("  ");
        do{
          System.out.println(num);
          num++;
        }while(num<=ValorFinal);
        x.close();
    }
}
