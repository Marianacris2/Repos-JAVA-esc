
package Janelinha;
import javax.swing.JOptionPane;

public class Pedido {
    private int salgado,doce,refrigerante2L,refrigerante6,refriLata,suco,mesa;
    private float preco;
    
    Pedido(){
        JOptionPane.showMessageDialog(null, "digite a quantidade que deseja:");
        String aux = JOptionPane.showInputDialog("Digite a quantidade de salgados");
        salgado = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite a quantidade de doce");
        doce = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite a quantidade de refri de 2L");
        refrigerante2L = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite a quantidade de refi de 600ml");
        refrigerante6 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite a quantidade de refriLata");
        refriLata = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite a quantidade de suco");
        suco = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite a mesa");
        mesa = Integer.parseInt(aux);
    }
    
    void calcularPreco(){
        preco = salgado*2 + doce*1.5f+refrigerante2L*7+refrigerante6*5+refriLata*4+suco*3;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
    public int getSalgado() {
        return salgado;
    }

    public void setSalgado(int salgado) {
        this.salgado = salgado;
    }

    public int getDoce() {
        return doce;
    }

    public void setDoce(int doce) {
        this.doce = doce;
    }

    public int getRefrigerante2L() {
        return refrigerante2L;
    }

    public void setRefrigerante2L(int refrigerante2L) {
        this.refrigerante2L = refrigerante2L;
    }

    public int getRefrigerante6() {
        return refrigerante6;
    }

    public void setRefrigerante6(int refrigerante6) {
        this.refrigerante6 = refrigerante6;
    }

    public int getRefriLata() {
        return refriLata;
    }

    public void setRefriLata(int refriLata) {
        this.refriLata = refriLata;
    }

    public int getSuco() {
        return suco;
    }

    public void setSuco(int suco) {
        this.suco = suco;
    }
    
    
    
}
