// https://es.slideshare.net/josedu454/ejercicios-while
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       int notas,mayor=0,menor=0,contador=0;
       do{
       System.out.println("Digite el valor de la nota: #"+(contador+1));
       notas=x.nextInt();
       contador++;
       if(notas>=7){
         mayor++;
       }else{
        menor++;
       }
       }while(contador<10);
       System.out.println("Cantidad de notas mayores a 7: "+mayor+ " Notas");
       System.out.println("Cantidad de notas menores a 7: "+menor+ " Notas");

        

       x.close();
    }
}
