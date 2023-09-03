import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
       byte n;
       byte x=1,num1=1;
       do{
       System.out.println("Hasta que tabla de multiplicar desea saber?");
       n=s.nextByte();
       }while(n<=0);

       do{
         do{
          System.out.println(num1 + " x " + x + " = " + num1*x);
            x++;
         }while(x<=10);
         System.out.println("  ");
         x=1;
         num1++;
       }while(num1<=n);
       System.out.println("Fin");

       s.close();
    }
}
