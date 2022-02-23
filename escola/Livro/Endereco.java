
package escola;
import java.util.Scanner;

public class Endereco {
    Scanner entrada = new Scanner(System.in);
    private String rua,cidade,cep;
    
    Endereco(){
        System.out.println("digite os dados necessarios:");
        rua = entrada.nextLine();
        cidade = entrada.nextLine();
        cep = entrada.nextLine();
    }
    void exibirDados(){
        System.out.println("rua: "+rua);
        System.out.println("cidade: "+cidade);
        System.out.println("cep: "+cep);
    }
    void atualizar(){
        System.out.println("digite os dados necessarios:");
        rua = entrada.nextLine();
        cidade = entrada.nextLine();
        cep = entrada.nextLine();
    }
// get e set
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
