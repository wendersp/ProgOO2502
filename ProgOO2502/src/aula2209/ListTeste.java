/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2209;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author wender
 */
public class ListTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List lista = new ArrayList();
        
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        
        System.out.println("enhanced for - lambda (java 8)");
        lista.forEach(System.out::println);
        
        
        ClasseA c1 = new ClasseA();
        c1.setNome("nA");
        ClasseA c2 = new ClasseA();
        c2.setNome("nB");
        ClasseA c3 = new ClasseA();
        c3.setNome("nC");
        ClasseA c4 = new ClasseA();
        c4.setNome("nD");
        
        
        List<ClasseA> listaA = new ArrayList<>();
        listaA.add(c1);
        listaA.add(c2);
        listaA.add(c3);
        listaA.add(c4);
        
        
        System.out.println("enhanced for - lambda (java 8)");
        listaA.forEach(classeA -> {
            System.out.println(classeA.getNome());
        });
        
        System.out.println("Laço While");
        
        Iterator<ClasseA> itListaA = listaA.iterator();
        
        while (itListaA.hasNext()) {
            ClasseA ca = (ClasseA)itListaA.next();
            System.out.println(ca.getNome());
        }
        
        System.out.println("Laço For");
        for (Iterator<ClasseA> item = listaA.iterator(); item.hasNext();) {
             ClasseA ca = (ClasseA)item.next();
            System.out.println(ca.getNome());
        }
        
        for (ClasseA objClasseA : listaA) {
            System.out.println(objClasseA.getNome());
        }
        
    }
    
}
