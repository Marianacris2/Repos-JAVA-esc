package escola;
import java.util.Scanner;

public class Escola{
        public static void main(String [] args){
            Scanner entrada = new Scanner(System.in);
            int n,c=0;
            
            System.out.println("Digite um numero");
            n=entrada.nextInt();
            for(int i=0;i<n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println("primo");
            }
        }
}