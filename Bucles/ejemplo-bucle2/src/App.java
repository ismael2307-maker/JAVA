import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int aleatorio=(int)(Math.random()*100);

        int numero=0;
        int intentos=0;

        while(numero!=aleatorio){
            intentos++;
            System.out.println("Digite un numero");
            numero=x.nextInt();
            if(aleatorio<numero){
                System.out.println("Mas bajo");
            }else if(aleatorio>numero){
                System.out.println("Mas alto");
            }
        }
        System.out.println("Correcto. El N° de intentos fue de: "+intentos);
        
        x.close();
    }
}
