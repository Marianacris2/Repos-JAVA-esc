package escola;
import java.util.Scanner;
public class Produto {
    Scanner entrada = new Scanner(System.in);
    int codigo;
    String descricao;
    float preco;
    
    void consultarPreco(){
        
    }
    void cadastrarDados(){
        System.out.println("digite os dados necessarios:");
        codigo = entrada.nextInt();
        descricao = entrada.nextLine();
        preco = entrada.nextFloat();
    }
    void exibirDados(){
        System.out.println("codigo: "+codigo);
        System.out.println("descricao: "+descricao);
        System.out.println("preco: "+preco);
        
    }
    void mudarPreco(){
        
    }
    void calcularDesconto(float desconto){
        
    }

}
