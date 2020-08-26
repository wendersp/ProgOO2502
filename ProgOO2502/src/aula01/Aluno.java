/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author wender
 */
public class Aluno {

    //Declarando as variaveis/atributos (Estado)
    String nome;
    double nota01;
    double nota02;
    double nota03;
    double nota04;
    private double media;
    
    public void calcMedia() {
        media = (nota01 + nota02 + nota03 + nota04)/4;
    }
    
    public void imprimirMedia() {
        System.out.println("A media do Aluno " + nome + " é  " + media);
        if (media >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }        
    }
                        

}
