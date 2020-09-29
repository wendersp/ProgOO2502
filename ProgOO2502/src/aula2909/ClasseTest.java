package aula2909;

public class ClasseTest {

    public static void main(String[] args) {
        
        Calc.x = 8;
        
        System.out.println("Resultado da soma: " + Calc.soma(3, 5));
        System.out.println("Resultado da soma: " + Calc.soma(3, 5, 2));
        System.out.println("Resultado da soma: " + Calc.soma(3.6, 5.0));
        System.out.println("Resultado da soma: " + Calc.soma(3.9, 5.5, 2.7));

    }

}
