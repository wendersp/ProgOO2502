package aula0809;

import javax.swing.JOptionPane;

public class ExemploArray {

    public static void main(String[] args) {

        double[] votos = {0, 0, 0, 0, 0, 0};
        int voto;
        int totalVotos = 0;
        int percVotosNulo, percVotosBranco;

        voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o voto.(para finalizar digite 0)"));
        while (voto != 0) {            
            if ((voto > 0) && (voto <= 6)) {
                totalVotos++;
                votos[voto - 1]++;
            } else {
                System.out.println("voto invalido");
            }
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o voto.(para finalizar digite 0)"));
        }
        
        percVotosBranco = (int) ((votos[5] / totalVotos) * 100);
        percVotosNulo = (int) ((votos[4] / totalVotos) * 100);
        
         //Saida de Dados;
        System.out.println("Total de Votos..............: " + totalVotos);
        System.out.println("Total de Votos Candidato 01.: " + votos[0]);
        System.out.println("Total de Votos Candidato 02.: " + votos[1]);
        System.out.println("Total de Votos Candidato 03.: " + votos[2]);
        System.out.println("Total de Votos Candidato 04.: " + votos[3]);
        System.out.println("Total de Votos Nulos........: " + votos[4]);
        System.out.println("Total Porc. de Votos Nulos..: " + percVotosNulo + " %");
        System.out.println("Total de Votos Branco.......: " + votos[5]);
        System.out.println("Total Porc. de Votos Branco.: " + percVotosBranco + " %");
    }

}
