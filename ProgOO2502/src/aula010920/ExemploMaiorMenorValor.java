/*
 1 - Construa um programa que, dado um conjunto de valores inteiros e positivos, 
determine qual o menor e o maior valor do conjunto. O final do conjunto de 
valores é conhecido atraves do valor -1, que não deve ser considerado.
 */
package aula010920;

import javax.swing.JOptionPane;

public class ExemploMaiorMenorValor {
    public static void main(String[] args) {
     //dados
     int menorValor, maiorValor, valor;
     menorValor = 99999;
     maiorValor = -1;
     
     valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro e positivo!(para finalizar digite -1)"));
     while (valor > -1) {         
         if (valor < menorValor) {
             menorValor = valor;
         }           
         if (valor > maiorValor) {
             maiorValor = valor;
         }  
         valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro e positivo!(para finalizar digite -1)"));
     }     
     JOptionPane.showMessageDialog(null,"O menor valor digitado foi: " + menorValor + "\nE o maior valor digitado foi: " + maiorValor);     
    }    
}
