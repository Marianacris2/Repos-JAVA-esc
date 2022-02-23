
package Janelinha;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class PrincipalLivro {
    public static void main(String [] arg){
        //Livro livro[] = new Livro[2];
        
        ArrayList<Livro> estante = new ArrayList<>();
        int i=0;
        
        do{
           Livro livro= new Livro();
            estante.add(livro);
            i++;
        }while(i<=2);
        
        int j=0;
        /*do(
           String op= JOptionPane.showInputDialog("Digite a opcao que deseja:");
           )while(op.equalIgnoreCase("6"));
        */
             
    }
    
}
