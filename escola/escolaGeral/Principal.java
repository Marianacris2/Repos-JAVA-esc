package escola;
import java.util.Scanner;
public class Principal {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        Produto mouse = new Produto();
        Produto teclado = new Produto();
        Produto impressora = new Produto();
        int op;
        Pessoa cliente1 = new Pessoa();
        Pessoa cliente2 = new Pessoa();
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        Compra compra3 = new Compra();
        float total=0;
        
        Pessoa pessoas[] = new Pessoa[10];
        for(int i=0; i<3; i++){
            pessoas[i] = new Pessoa();
        }
        System.out.println("cadastro dos 3 produtos, respectivamente");
        mouse.cadastrarDados();
        teclado.cadastrarDados();
        impressora.cadastrarDados();
        
        for(int j=0;j<3;j++){
            System.out.println("digite a opcao q deseja:"
                    + " 1-cadastrar clientes/ 2- consultar clientes 3-exibir produtos da loja"
                    + " 4-atualizar endereco do cliente"
                    + " 5-realizar compra "
                    + "6-exibir compras realizadas "
                    + " 7-exibir quanto a loja tem em caixa "
                    + "8-exibir a compra de algum dia");
            op= entrada.nextInt();
            switch(op){
                case 1:
                    cliente1.cadastrar();
                    cliente2.cadastrar();
                break;
                case 2:
                    cliente1.exibirDados();
                    cliente2.exibirDados();
                break;
                case 3:
                    System.out.println("aqui estao os 3 produtos disponiveis:");
                    mouse.exibirDados();
                    teclado.exibirDados();
                    impressora.exibirDados();
                break;
                case 4:
                    System.out.println("qual o cliente deseja mudar o endereco?");
                    String clienteend = entrada.nextLine();
                    if(clienteend == cliente1.nome){
                        cliente1.endereco.atualizar();
                    }
                    if(clienteend == cliente2.nome){
                        cliente2.endereco.atualizar();
                    }
                break;
                case 5:
                    System.out.println("digite 1 para cliente 1 e 2 para cliente 2"
                            + " e qual o produto que deseja comprar.");
                    int c = entrada.nextInt();
                    String p = entrada.nextLine();
                    if(p == "mouse" && c==1){
                        compra1.realizarCompra(cliente1, mouse);
                        total = total+compra1.valor;
                     }
                    if(p == "mouse" && c==2){
                        compra1.realizarCompra(cliente2, mouse);
                        total = total+compra1.valor;
                     }
                    if(p == "teclado" && c==1){
                        compra2.realizarCompra(cliente1, teclado);
                        total = total+compra2.valor;
                     }
                    if(p == "teclado" && c==2){
                        compra2.realizarCompra(cliente2, teclado);
                        total = total+compra2.valor;
                     }
                    if(p == "impressora" && c==1){
                        compra3.realizarCompra(cliente1, impressora);
                        total = total+compra3.valor;
                     }
                    if(p.equalsIgnoreCase("impressora") && c==2){
                        compra3.realizarCompra(cliente2, impressora);
                        total = total+compra3.valor;
                     }
                break;
                case 6:
                    if(compra1.data != "0"){
                        compra1.exibirDados();
                    }
                    if(compra2.data != "0"){
                        compra2.exibirDados();
                    }
                    if(compra3.data != "0"){
                        compra3.exibirDados();
                    }
                break;
                case 7:
                    System.out.println("quanto a loja tem em caixa: "+total);
                break;
                case 8:
                    System.out.println("digite a data que a compra foi realizada:");
                    String d = entrada.nextLine();
                    if(d == compra1.data){
                        compra1.exibirDados();
                    }
                    if(d == compra2.data){
                        compra2.exibirDados();
                    }
                    if(d == compra3.data){
                        compra3.exibirDados();
                    }
                break;

            }
        }
        
        
    }
}
