
package escola;

import java.util.Scanner;
public class Cliente {
    Scanner entrada = new Scanner(System.in);
    private String nome,email;
    
    Cliente(){
        nome=entrada.nextLine();
        email = entrada.nextLine();
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
    void exibirDados(){
        System.out.println("nome e email"); // colocar os dados :/
    }
    
}
