
package Heranca;
import java.util.Scanner;
import java.util.ArrayList;

public class Pessoa1 {
    Scanner entrada = new Scanner(System.in);
    private String nome, cpf, rua, cep, cidade;
    
        Pessoa1(){
            nome = entrada.nextLine();
            cpf = entrada.nextLine();
            rua = entrada.nextLine();
            cep = entrada.nextLine();
            cidade = entrada.nextLine();
        }
        
      void exibirDados(){
          System.out.println(nome+cpf+rua+cep+cidade);
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
        
        
}
