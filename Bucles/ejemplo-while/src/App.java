import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        String clave ="Ismael";
        int intentos=0;
        String Contra="";

        while(clave.equals(Contra)==false && intentos<=3){
            Contra=JOptionPane.showInputDialog("Introduzca la contraseña"
            +"Contra. Intento ");
            intentos++;
            if(clave.equals(Contra)==false){
                System.out.println("La contraseña es incorrecta");
            }     
        }
        if(intentos==3){
          System.out.println("Haz intentado muchas veces, regresa mas tarde");
        }else{
            System.out.println("La contraseña es correcta");
            System.out.println("Lo logro en: "+intentos+ " Intentos");
            
            
        }
     }
    }

