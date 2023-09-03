import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);       
        int x=1;

         System.out.println("Que tabla de multipilcar desea saber?");
         int n=s.nextInt();
         
         do{
            System.out.println("no se puede digitar ni ceros ni numeros negativos");
            System.out.println("  ");
            System.out.println("Que tabla de multipilcar desea saber?");
            n=s.nextInt();
         }while(n<0);

         do{
            System.out.println(n+ " x " + x + " = " +n*x);
            x++;
         }while(x<=10);
          System.out.println("Fin");
         s.close();
    }
}
