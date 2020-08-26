/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2508;

import javax.swing.JOptionPane;

/**
 *
 * @author wender
 */
public class Exemplo02 {
    /*
    Construra um programa que, tenha como dados de entrada o nome e preço 
    de um produto e seu código de origem, mostre o nome e o preço junto de sua procedência. 
    Caso o código não seja nenhum dos especificado, o produto deve ser encardo 
    como importado. Siga a tabela de código a seguir:
    codigo de origem    Procedência
    1                   SUL
    2                   NORTE
    3                   LESTE
    4                   OESTE
    5 ou 6              NORDESTE
    7, 8 ou 9           SUDESTE
    10 até 20           CENTRO-OESTE
    25 até 30           NORDESTE
    */
    public static void main(String[] args) {
        //declaração dos atributos/variaveis
        String nomeProduto;
        double preco;
        int codigo;
        String origem = "";
        
        //entrda de dados
        nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Produto"));
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de Origem do Produto:"));
        
        //processamento 
        if (codigo == 1) {
            origem = "SUL";
        } else if(codigo == 2) {
            origem = "NORTE";
        } else if (codigo == 3) {
            origem = "LESTE";
        } else if (codigo == 4) {
            origem = "OESTE";
        } else if ((codigo == 5) || (codigo == 6) || ((codigo >= 25) && (codigo <= 30))) {
            origem = "NORDESTE";
        } else if ((codigo == 7) || (codigo == 8) || (codigo == 9)) {
            origem = "SUDESTE";
        } else if ((codigo >= 10) && (codigo <= 20)) {
            origem = "CENTRO-OESTE";
        } else {
            origem = "IMPORTADO";
        }
        
        
        
        //saida de dados
        System.out.println("Nome Produto.: " + nomeProduto);
        System.out.println("Preço........: " + preco);
        System.out.println("Origem.......: " + origem);
       
       
    }
    
}
