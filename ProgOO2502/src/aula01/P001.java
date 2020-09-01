
package aula01;

/**
 *
 * @author wender
 */
public class P001 {
    
    
    String n;
    double x01;
    double x02;
    double x03;
    double x04;
    private double y;
    
    public void m001() {
        y = (x01 + x02 + x03 + x04)/4;
    }
    
    public void m002() {
        System.out.println("A media do Aluno " + n + " é  " + y);
        if (y >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }        
    }
    
}
