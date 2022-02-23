
package Janelinha;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Clinica {
 public static void main(String[] args) {
        String nome;
        Endereco endereco;
        int cont=0;
        Consulta consulta;
        
        ArrayList<Consulta> consultas = new ArrayList<>();
        
        String op;
        for(;;){
            op = JOptionPane.showInputDialog("Digite a opcao que deseja");
            
            if(op.equals("a")){
                cont =0;
                String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente");
                for(int i=0;i<consultas.size();i++){
                    if(nomePaciente.equalsIgnoreCase(consultas.get(i).getPaciente().getNome())){
                       cont++;
                    }
                }
                if(cont>0){
                        for(int i=0;i<consultas.size();i++){
                        if(nomePaciente.equalsIgnoreCase(consultas.get(i).getPaciente().getNome())){
                           consulta = new Consulta(consultas.get(i).getPaciente());
                           consultas.add(consulta);
                        }
                    }
                }
                if(cont==0){
                    consulta = new Consulta();
                    consultas.add(consulta);
                }
            }
            
            if(op.equals("b")){
                JOptionPane.showMessageDialog(null,"passou");
                for(int j=0;j<consultas.size();j++){
                    consultas.get(j).exibirDados();
                }
                
            }
            if(op.equals("c")){
                 String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente");
                for(int i=0;i<consultas.size();i++){
                    if(nomePaciente.equalsIgnoreCase(consultas.get(i).getPaciente().getNome())){
                       consultas.get(i).getPaciente().getEndereco().atualizar();
                    }
                }
            }
            
           if(op.equals("sair")){
                break;
            }
  }
  
 }
}
/*
quando cadastrar consulta verificar se o paciente ja foi cadastrado;
vizualizar todas as consultas
atualizar endereco de um paciente(pedir nome)
*/