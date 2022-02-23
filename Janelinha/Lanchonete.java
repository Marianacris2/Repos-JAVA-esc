
package Janelinha;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Lanchonete {  
    
    public static void main(String [] args){
        float precoTotal=0;
        String aux = JOptionPane.showInputDialog("Digite a quantidade de mesas");
        int numero = Integer.parseInt(aux);

        Mesa mesas[] = new Mesa[numero];
        String continuar;
        int op,nMesa;
        for(;;){
            aux = JOptionPane.showInputDialog("Digite a opcao");
            op= Integer.parseInt(aux);
            if(op==1){
                aux = JOptionPane.showInputDialog("qual sua mesa?");
                nMesa = Integer.parseInt(aux);
                mesas[nMesa] = new Mesa();
            }
            if(op==2){
                aux = JOptionPane.showInputDialog("qual sua mesa?");
                nMesa = Integer.parseInt(aux);
                mesas[nMesa].pedido.calcularPreco();
            }
            if(op==3){
                for(int i=0;i<numero;i++){
                    precoTotal = precoTotal+ mesas[i].pedido.getPreco();
                }
            }
            
            continuar = JOptionPane.showInputDialog("Digite se deseja continuar");
            if(continuar.equals("nao")){
                break;
            }
        }
    }
    
    
    
    
}
