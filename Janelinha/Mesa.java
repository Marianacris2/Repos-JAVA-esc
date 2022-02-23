
package Janelinha;

public class Mesa {
    Pedido pedido;
    
    Mesa(){
     pedido = new Pedido();   
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
    void novoPedido(){
        pedido = new Pedido();
    }
}
