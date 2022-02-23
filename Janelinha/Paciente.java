
package Janelinha;

import javax.swing.JOptionPane;

public class Paciente {
    private String nome, telefone;
    private Endereco endereco;
    
    Paciente(){
        nome = JOptionPane.showInputDialog("Digite seu nome");
        telefone = JOptionPane.showInputDialog("Digite seu telefone");
        endereco = new Endereco();
    }
    void exibirDados(){
        JOptionPane.showMessageDialog(null,"nome: "+nome+" telefone: "+telefone);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
