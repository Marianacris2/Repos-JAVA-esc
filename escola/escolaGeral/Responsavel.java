/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;
import java.util.Scanner;
public class Responsavel {
    Scanner entrada= new Scanner(System.in);
    String nome,telefone;
    char sexo;
    
    void cadastrar(){
        System.out.println("digite seus dados");
        nome=entrada.next();
        telefone=entrada.next();
        sexo=entrada.next().charAt(0);
    }
    void exibirDados(){
        System.out.println("nome "+nome+"; telefone "+telefone+"; sexo "+sexo);
    }
    void atualizarTelefone(){
        System.out.println("novo telefone:");
        telefone=entrada.next();
        System.out.println("telefone mudado");
    }
}
