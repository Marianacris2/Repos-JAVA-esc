
package escola;

import java.util.Scanner;
public class Casa {
    Scanner entrada=new Scanner(System.in);
    String cor;
    int numero;
    Porta portaDaFrente = new Porta();
    Porta portaDeFundo= new Porta();
    Responsavel responsavel= new Responsavel();
    
    //portaDeFundo.abrir();
    
    void pintar(){
        System.out.println("digita a cor da casa");
        cor = entrada.next();
        System.out.println("nova cor: "+cor);
    }
    void estaAberta(){
        if(portaDaFrente.aberta == true && portaDeFundo.aberta ==true){
            System.out.println("casa aberta");
        }
    }
    void consultarResponsavel(){
        responsavel.exibirDados();
    }
    void mudarResponsavel(){
        responsavel.cadastrar();
    }
    void fechar(){
        portaDaFrente.fechar();
        portaDeFundo.fechar();
        System.out.println("portas fechadas");
    }
   
    
    
}
