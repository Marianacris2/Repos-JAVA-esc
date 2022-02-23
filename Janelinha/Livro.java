
package Janelinha;
import javax.swing.JOptionPane;
public class Livro {
    private String titulo;
    private float preco;
    Autor autor;
    
    Livro(){
        JOptionPane.showMessageDialog(null,"Digite os dados do Livro:");
        titulo = JOptionPane.showInputDialog("Digite o titulo: ");
        String aux = JOptionPane.showInputDialog("Digite o preco: ");
        preco= Float.parseFloat(aux);
        autor = new Autor();
    }
    void exibirInformacoes(){
        JOptionPane.showMessageDialog(null, "titulo: "+titulo);
        JOptionPane.showMessageDialog(null, "autor: "+autor.getNome());
        JOptionPane.showMessageDialog(null, "preco: "+preco);
    }
    void calcularDesconto(){
        preco = preco-(preco*0.2f);
        JOptionPane.showMessageDialog(null, "o preco ficou de: "+preco);
    }
    Float calcularDesconto(float desconto){
           preco = preco-(preco*desconto);
           JOptionPane.showMessageDialog(null, "o preco ficou de: "+preco);
           return null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
