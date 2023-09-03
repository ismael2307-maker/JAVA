import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n,cantidad=0,x=1;
        float largo;
        System.out.println("Cuantas piezas gestionara");
        n=s.nextInt();
        do{
          System.out.println("Ingrese la medida de la pieza");
          largo=s.nextFloat();
          cantidad++;
          if(largo<=1.20 && largo>=1.30){
          }
          x++;
        }while(x<=n);
        System.out.println("La cantidad de piezaz aptas son: "+cantidad);
      s.close();
    }
}
