
package escola;
import java.util.Scanner;
public class PrincipalEveneto {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
    
        Evento evento1 = new Evento();
        Evento evento2 = new Evento();      

        evento2.getCliente().setEmail("novo email");
        System.out.println("digite o dia do evento");
        int dia = entrada.nextInt();
        evento1.calcularPromocao(dia);
    }
    
}
