
package escola;
import java.util.Scanner;

public class Pessoa {
    Scanner entrada = new Scanner(System.in);
    String nome,cpf;
    Endereco endereco= new Endereco();
    
    void consultarEndereco(){
        
    }
    void exibirDados(){
        System.out.println("nome: "+nome);
        System.out.println("cpf: "+cpf);
        endereco.exibirDados();
    }
    void cadastrar(){
        System.out.println("digite os dados necessarios:");
        nome= entrada.nextLine();
        cpf = entrada.nextLine();
 
    }
    
}
