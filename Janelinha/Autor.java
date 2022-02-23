
package Janelinha;
import javax.swing.JOptionPane;
public class Autor {
    private String nome, email;
    Endereco endereco;
    
    Autor(){
        JOptionPane.showMessageDialog(null,"Digite os dados do autor: ");
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        email = JOptionPane.showInputDialog("Digite o email:");
        endereco = new Endereco();
    }
    void atualizarAutor(){
        JOptionPane.showMessageDialog(null,"Digite os dados do autor novamente: ");
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        email = JOptionPane.showInputDialog("Digite o email:");
        endereco = new Endereco();
    }
    void atualizarEndereco(){
        endereco.atualizar();
    }
    void exibirDados(){
        JOptionPane.showMessageDialog(null,"nome: "+nome);
        JOptionPane.showMessageDialog(null,"email: "+email);
        endereco.exibirDados();
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
