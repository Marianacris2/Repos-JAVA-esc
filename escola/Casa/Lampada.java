
package escola;
import java.util.Scanner;
public class Lampada {
    Scanner entrada = new Scanner(System.in);
    boolean acesa=false;
    float potencia;
    
    void acender(){
        acesa=true;
    }
    void apagar(){
        acesa=false;
    }
    void informarSituacao(){
        if(acesa==true){
            System.out.println("esta acesa");
        }else{
            System.out.println("esta apagada");
        }
    }
    void informarPotencia(){
        System.out.println("a potencia e: "+potencia);
    }    
    
    
}
