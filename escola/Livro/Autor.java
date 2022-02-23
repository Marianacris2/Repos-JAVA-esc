
package escola;
import java.util.Scanner;
public class Autor {
    private String nome, email,telefone,cpf;
    Scanner entrada = new Scanner(System.in);
    private Endereco endereco;
    
    Autor(){
        System.out.println("digite os dados necessarios: nome,email,telefone");
        nome = entrada.nextLine();
        email = entrada.nextLine();
        telefone = entrada.nextLine();
        endereco = new Endereco();
    }
    
    void exibirDados(){
        System.out.println("nome "+nome);
        System.out.println("email: "+email);
        System.out.println("telefone: "+telefone);
    }
    void atualizarEndereco(){
      endereco = new Endereco();
    }

    // psrte dos gets e sets, caso não queira digitar, lembre que a ide possui uma funcao para isso :D
    Endereco getEndereco(){
        return endereco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
