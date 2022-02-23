
package escola;
import java.util.Scanner;
public class Evento {
    Scanner entrada = new Scanner(System.in);
    private String nome, data;
    private float preco;
    private Cliente cliente;
    
    Evento(){
        nome = entrada.nextLine();
        data = entrada.nextLine();
        preco = entrada.nextFloat();
        cliente = new Cliente();
    }
    Evento(Cliente clienteobj){
        this.cliente = clienteobj;
        nome = entrada.nextLine();
        data = entrada.nextLine();
        preco = entrada.nextFloat();
    }
    // aqui foi usado sobrecarga para quando um cliente ja cadastrado no sistema quiser cadastrar algum evento

     void exibirDados(){
         System.out.println("dados"); // aqui vao ser impressos os dados
     }
     
     void calcularPromocao(int dia){
         if(dia>2 && dia<5){
             float valor = preco - (preco*0.25f);
             System.out.println("valor sem deconto: "+preco+"valor com desconto: "+valor);
         }else{
             float valor = preco - (preco*0.12f);
             System.out.println("valor sem deconto: "+preco+"valor com desconto: "+valor);
         }
     }
    // get e set dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

     Cliente getCliente() {
        return cliente;
    }

    
    
}
