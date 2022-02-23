
package escola;
import java.util.Scanner;
public class Compra {
    Scanner entrada = new Scanner(System.in);
    String data="0";
    Produto produto = new Produto();
    int quantidade;
    float valor;
    
    void realizarCompra(Pessoa cliente,Produto produto){
        System.out.println("digite a quantidade e a data do produto");
        quantidade = entrada.nextInt();
        data = entrada.nextLine();
        valor = quantidade*produto.preco;
        System.out.println("vc pagara: "+valor);
    }
    void exibirDados(){
        System.out.println("data: "+data);
        System.out.println("quantidade: "+quantidade);
        produto.exibirDados();
    }
}
