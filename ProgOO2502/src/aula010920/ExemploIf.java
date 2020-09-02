/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula010920;

import javax.swing.JOptionPane;

public class ExemploIf {
    public static void main(String[] args) {
        double media;        
        media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media do Aluno:"));        
        if (media >= 7) {  
            JOptionPane.showMessageDialog(null, "Aluno Aprovado!");
        } else if (media >= 4)  {
            JOptionPane.showMessageDialog(null, "Aluno esta de N3", "Atenção",JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno Reprovado!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }        
        /*
         se (media >= 7) 
            entao
                escreva ("Aluno Aprovado!");
            senao se (media >= 4)
                     entao
                        escreva ("Aluno esta de N3");        
                     senao
                        escreva ("Aluno esta reprovado");
                   fimse
         fimse                     
        */                
    }
    
}
