
package aula0809;

import javax.swing.JOptionPane;


public class ExemploArray2 {

    public static void main(String[] args) {

        int[] a = new int[20];
        int soma = 0;
        
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + i + " do array"));
        } 
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[ " + i + " ] = " + a[i]);
            soma += a[i];           
        } 
        
        System.out.println("A soma dos valores é " + soma);
        

        
    }
    
}
