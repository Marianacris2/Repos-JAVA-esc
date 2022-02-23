
package Heranca;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    int p;
    Scanner entrada = new Scanner(System.in);
    
    ArrayList<Pessoa1> pessoas = new ArrayList<>();
    
    void cadastroCliente(){
        System.out.println("digite o tipo da pessoa");
        p = entrada.nextInt();
        if(p==1){
            PessoaFisica pessoaFisica = new PessoaFisica();
            pessoas.add(pessoaFisica);
        }
        if(p==2){
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            pessoas.add(pessoaJuridica);
        }
        
    }
}
