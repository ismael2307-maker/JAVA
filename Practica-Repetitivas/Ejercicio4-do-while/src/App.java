import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       int contador=0,suma=0,num;
       int positivos=0;
       int negativos=0;

       do{
         System.out.println("Digite el valor del numero");
         num=x.nextInt();
         contador++;
         if(num>0){
           positivos++;
         }else{
            negativos--;
         }
         suma=suma+num;

       }while(contador<10);
       System.out.println("La suma de los nuemros es: "+suma);
       System.out.println("Los numeros positivos son: "+positivos);
       System.out.println("Los numeros negativos son: "+negativos);
    }
}
