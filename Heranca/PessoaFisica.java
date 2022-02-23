
package Heranca;
  import java.util.Scanner;


public class PessoaFisica extends Pessoa1{
    Scanner entrada = new Scanner(System.in);
    private String dtNasc, profissao, sexo, telefone;
    
    PessoaFisica(){
        super();
        dtNasc= entrada.nextLine();
        profissao = entrada.nextLine();
        sexo = entrada.nextLine();
        telefone = entrada.nextLine();
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
