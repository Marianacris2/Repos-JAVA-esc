package escola;

import java.util.Scanner;
public class Livro {
    Scanner entrada = new Scanner(System.in);
    // aqui estou encapsulando
    private String titulo, genero;
    private float preco;
    private Autor autor;
    
    Livro(){
        System.out.println("digite os dados necessarios:");
        titulo = entrada.nextLine();
        genero = entrada.nextLine();
        preco = entrada.nextFloat();
        autor = new Autor();
    }
    // sobrecarga, pra quando eu tiver um autor já cadastrado
    Livro(Autor autorobj){
        System.out.println("digite os dados necessarios: titulo,genero,preco");
        titulo = entrada.nextLine();
        genero = entrada.nextLine();
        preco = entrada.nextFloat();
        this.autor = autorobj;   // vou receber por parametro o autorobj e colocar no meu objeto aqui da classe
        
    }
    void exibirDados(){
        System.out.println("titrulo "+titulo);
        System.out.println("genero: "+genero);
        System.out.println("preco: "+preco);
        autor.exibirDados();
        
    }
    void calcularDesconto(){
        preco = preco - (preco*0.1f);
    }
    void calcularDesconto(float desconto){
        preco = preco - (preco*desconto);
    }
    
    // os sets e gets, pra mudar e retonar os atributos privados
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public float getPreco() {
        return preco;
    }

     Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
}
