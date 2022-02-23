/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;
import java.util.Scanner;

public class Lp {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Lampada lampada = new Lampada();
        lampada.acender();
        lampada.informarSituacao();
        lampada.apagar();
        lampada.informarSituacao();
        Lampada lampada2 = new Lampada();
        System.out.println("informe a potencia das duas respectivamente");
        lampada2.potencia = entrada.nextFloat();      
        lampada.potencia = entrada.nextFloat();  
        lampada2.informarSituacao();
        lampada2.informarPotencia();
        lampada2.acender();
        lampada2.informarSituacao();
        for(int i=0;i<3;i++){
            System.out.println("digite a lampada e opcao que deseja:");
            System.out.println("digite o que vc deseja fazer?:");
            int op,l;
            op = entrada.nextInt();
            l = entrada.nextInt();
            if(op==1 && l==1){
               lampada.acender();
                System.out.println("lampada acesa");
            }
            if(op==1 && l==2){
               lampada.apagar();
               System.out.println("lampada apagada");
            }
            if(op==1 && l==3){
               lampada.informarSituacao();
            }
            if(op==1 && l==4){
               lampada.informarPotencia();
            }
            if(op==2 && l==1){
               lampada2.acender();
               System.out.println("lampada acesa");
            }
            if(op==2 && l==2){
               lampada.apagar();
               System.out.println("lampada apagada");
            }
            if(op==2 && l==3){
               lampada2.informarSituacao();
            }
            if(op==2 && l==4){
               lampada2.informarPotencia();
            }
            
        }
    }
    
}
