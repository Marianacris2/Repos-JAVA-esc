
package Janelinha;
import javax.swing.JOptionPane;

public class Endereco {
    private String rua, cep,cidade;
    
    Endereco(){
        JOptionPane.showMessageDialog(null,"Digite os dados do endereco: ");
        rua = JOptionPane.showInputDialog("Digite sua rua: ");
        cep = JOptionPane.showInputDialog("Digite sua cep: ");
        cidade = JOptionPane.showInputDialog("Digite sua cidade: ");
    }
    void exibirDados(){
        JOptionPane.showMessageDialog(null, "rua: "+rua);
        JOptionPane.showMessageDialog(null, "cep: " + cep);
        JOptionPane.showMessageDialog(null, "cidade: "+rua);
    }
    void atualizar(){
        JOptionPane.showMessageDialog(null,"Digite seus dados novamente para poder atualizar:");
        rua = JOptionPane.showInputDialog("Digite sua rua: ");
        cep = JOptionPane.showInputDialog("Digite sua cep: ");
        cidade = JOptionPane.showInputDialog("Digite sua cidade: ");
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
