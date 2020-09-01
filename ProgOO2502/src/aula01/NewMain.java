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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        P001 p1 = new P001();
        P001 p2 = new P001();

        p1.n = "Joao";
        p1.x01 = 5.0;
        p1.x02 = 8.8;
        p1.x03 = 3.0;
        p1.x04 = 10.0;

        p2.n = "Maria";
        p2.x01 = 8.0;
        p2.x02 = 8.8;
        p2.x03 = 9.0;
        p2.x04 = 10.0;

        p1.m001();
        p2.m001();

        p1.m002();
        p2.m002();
    }

}
