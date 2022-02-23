package escola;
import java.util.Scanner;
public class Porta {
    Scanner entrada = new Scanner(System.in);
    String cor="marrom";
    float largura=1,altura=1;
    boolean aberta;
    
    void abrir(){
        System.out.println("abindo a porta");
        aberta=true;
    }
    void fechar(){
        System.out.println("abindo a porta");
        aberta=false;
    }
    void pintar(){
        cor = entrada.next();
    }
    void estaAberta(){
        if(aberta==true){
            System.out.println(aberta);
        }
    }
    
}
