
package AulaESI;

import java.util.Scanner;


public class CalcMediaAluno {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //declaração das variaveis/atributos
        double n1, n2, n3, n4, md;
        //Entrda de dados
        System.out.print("Digite a 1 nota: ");
        n1 = leia.nextDouble();
        System.out.print("Digite a 2 nota: ");
        n2 = leia.nextDouble();
        System.out.print("Digite a 3 nota: ");
        n3 = leia.nextDouble();
        System.out.print("Digite a 4 nota: ");
        n4 = leia.nextDouble();
        //processamento
        md = (n1 + n2 + n3 + n4)/4;
        
        //Saida
        System.out.println("A media do Aluno é " + md);
        if (md >= 7) {  
            System.out.println("Aluno Aprovado!");  
        } else if (md >= 5) { 
            System.out.println("Aluno está de N3");
        } else {
            System.out.println("Aluno Reprovado!");
        }
        
            
        
        
    }
    
}
