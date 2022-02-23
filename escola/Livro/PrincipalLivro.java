
package escola;

import java.util.Scanner;
public class PrincipalLivro {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        // a op é para a opcao q o usuario deseja fazer
        int op=0;
        Livro livraria[] = new Livro[2];  // o vetor de livros que aqui tem 3 posicoes(pois comeca do 0)
        
        for(int i=0;i<2;i++){       // aqui estou instanciando(criando) todos os livros do vetor
            livraria[i] = new Livro();
        }

        while(op!=6){           // aqui usei o while, mas normalmente o pessoal usa for infinito, quando o usuario digitar o 6, o programa para
            System.out.println("digite a opcao q deseja fazer:");
            op= entrada.nextInt();
            
            if(op==1){  // exibir dados dos livros
                for(int i=0;i<2;i++){     
                    livraria[i].exibirDados();    // aqui vai imprimir os dados de cada posicao do vetor, onde cada uma possui um livro
                }
            }
            if(op==2){      // mostrar livros do mesmo autor
                String autor;       // criei a variavel autor aqui porque estava mais perto
                autor = entrada.next();
                for(int i=0;i<2;i++){
                    if(livraria[i].getAutor().getNome().equalsIgnoreCase(autor) ){  // aqui eu tenho acesso ao autor e depois ao nome
                        livraria[i].getTitulo();   
                        /* entao, se o nome do autor do livro for igual 
                        ao nome que o usuario digitar, entao vai ser mostrado o titulo do livro.
                        Aqui usei o equal pq nao pode usar o == em strings*/
                    }
                }
            }
            if(op==3){ // mudar endereco do autor que o usuario vai digitar
                String autor;
                autor = entrada.next();
                for(int i=0;i<2;i++){
                    if(livraria[i].getAutor().getNome().equalsIgnoreCase(autor) ){ 
                        livraria[i].getAutor().atualizarEndereco(); // pelo getAutor - que retorna o objeto autor - eu posso atualizar o endereco dele
                        // nao tem como usar um setEndereco aqui porque o endereco é uma classe e nao somente uma variavel
                    }
                }
            }
            if(op==4){ // calcular desconto de 10% em todos os livros
                for(int i=0;i<2;i++){   
                    livraria[i].calcularDesconto(0.1f);  
                    /*botei essa viadagem do f pra ele ter certeza q é float '-', 
                    mas pode colocar o outro metodo de calcular o desconto(sem o parametro) 
                    porque la especifiquei que o desconto vai ser 10% */
                }
            }
            if(op==5){ // calcular desconto que o usuario vai mandar
                float desconto;
                desconto = entrada.nextFloat();
                for(int i=0;i<2;i++){   
                    livraria[i].calcularDesconto(desconto);  // ai aqui to passando o desconto como parametro, e vai ser usado o metodo que tem parametro
                }
            }
        }
        
        
    }
    
}
