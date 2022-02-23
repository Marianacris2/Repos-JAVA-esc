
package Heranca;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa1{
    Scanner entrada = new Scanner(System.in);
    private String  razaoSocial, dtAbertura,telefone;
    
    PessoaJuridica(){
        super();
        razaoSocial = entrada.nextLine();
        dtAbertura = entrada.nextLine();
        telefone = entrada.nextLine();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
