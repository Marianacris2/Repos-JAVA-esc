
package Janelinha;
import javax.swing.JOptionPane;

public class Consulta {
    private String medico, data, hora;
    private Paciente paciente;
    
    Consulta(){
        medico = JOptionPane.showInputDialog("Digite o nome do medico");
        data = JOptionPane.showInputDialog("Digite a data");
        hora = JOptionPane.showInputDialog("Digite a hora");
        paciente = new Paciente();
    }
    Consulta(Paciente paciente){
        medico = JOptionPane.showInputDialog("Digite o nome do medico");
        data = JOptionPane.showInputDialog("Digite a data");
        hora = JOptionPane.showInputDialog("Digite a hora");
        this.paciente = new Paciente();
    }
    
    void exibirDados(){
        JOptionPane.showMessageDialog(null,"medico: "+medico+" data: "+data+" hora: "+hora);
        paciente.exibirDados();
        paciente.getEndereco().exibirDados();
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
