/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;
import java.util.Scanner;
public class PrincipalCasa {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Casa casamariana = new Casa();
        Casa casamarina = new Casa();
        Casa casaAlice = new Casa();
        
        for(int i=0;i<3;i++){
            int op,c;
            System.out.println("digite a opcao e a casa que deseja:");
            op=entrada.nextInt();
            c=entrada.nextInt();
            if(op==1 && c==1){
                casamariana.pintar();
            }
            if(op==1 && c==2){
                casamarina.pintar();
            }
            if(op==1 && c==3){
                casaAlice.pintar();
            }
            if(op==2 && c==1){
                casamariana.estaAberta();
            }
            if(op==2 && c==2){
                casamarina.estaAberta();
            }
            if(op==2 && c==3){
                casamariana.estaAberta();
            }
            if(op==3 && c==1){
                casamariana.portaDaFrente.abrir();
            }
            if(op==3 && c==2){
                casamarina.portaDaFrente.abrir();
            }
            if(op==3 && c==3){
                casaAlice.portaDaFrente.abrir();
            }
            if(op==4 && c==1){
                casamariana.fechar();
            }
            if(op==4 && c==2){
                casamarina.fechar();
            }
             if(op==4 && c==3){
                casaAlice.fechar();
            }
            if(op==5 && c==1){
                System.out.println(casamariana.responsavel.telefone);
            }
            if(op==5 && c==2){
                System.out.println(casamarina.responsavel.telefone);
            }
            if(op==5 && c==3){
                System.out.println(casaAlice.responsavel.telefone);
            }
            if(op==6 && c==1){
                casamariana.mudarResponsavel();
            }
            if(op==6 && c==2){
                casamarina.mudarResponsavel();
            }
            if(op==6 && c==3){
                casaAlice.mudarResponsavel();
            }
        }
    }
}
