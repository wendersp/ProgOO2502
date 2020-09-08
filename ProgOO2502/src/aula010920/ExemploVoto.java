/*
2 - Em uma eleição presidencial, existem quatro condidatos. 
Os votos são informados através de código.
Os dados utilizados para a escrutinagem obedecem à seguinte codificação:
  - 1,2,3,4 = voto para os respectivos candidatos;
  - 5 = votos nulo;
  - 6 = voto em branco;

Elabore um programa que calcule e escreva:
  - total de votos para cada candidato;
  - total de votos nulos;
  - total de votos em branco;
  - porcentual dos votos em branco e nulos sobre o total.
como finalizador do conjunto de votos, tem-se o valor 0.
 */
package aula010920;

import javax.swing.JOptionPane;

public class ExemploVoto {

    public static void main(String[] args) {
        //declarar as variaveis
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, votosNulos = 0;
        double votosBranco = 0, totalVotos = 0;
        int percBranco = 0, percNulos = 0;
        int voto;
        //entrada de dados;
        voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o voto.(para finalizar digite 0)"));
        while (voto != 0) {
            totalVotos++;
           /*
            if (voto == 1) {
                cand1++;
            } else if (voto == 2) {
                cand2++;
            } else if (voto == 3) {
                cand3++;
            } else if (voto == 4) {
                cand4++;
            } else if (voto == 5) {
                votosNulos++;
            } else if (voto == 6) {
                votosBranco++;
            } else {
                System.out.println("voto invalido");
            }
           */
            switch (voto) {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 4:
                    cand4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                default:
                    System.out.println("voto invalido");
            }
            
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o voto.(para finalizar digite 0)"));
        }
        /*
        Calcular o porcentual dos votos em branco e nulos sobre o total 
        porcentual dos votos brancos = Total dos votos brancos / Total de votos * 100
        porcentual dos votos nulos = Total dos votos nulos / Total de votos * 100
       
         */
        percBranco = (int) ((votosBranco / totalVotos) * 100);
        percNulos = (int) ((votosNulos / totalVotos) * 100);

        //Saida de Dados;
        System.out.println("Total de Votos..............: " + totalVotos);
        System.out.println("Total de Votos Candidato 01.: " + cand1);
        System.out.println("Total de Votos Candidato 02.: " + cand2);
        System.out.println("Total de Votos Candidato 03.: " + cand3);
        System.out.println("Total de Votos Candidato 04.: " + cand4);
        System.out.println("Total de Votos Nulos........: " + votosNulos);
        System.out.println("Total Porc. de Votos Nulos..: " + percNulos + " %");
        System.out.println("Total de Votos Branco.......: " + votosBranco);
        System.out.println("Total Porc. de Votos Branco.: " + percBranco + " %");

    }

}
