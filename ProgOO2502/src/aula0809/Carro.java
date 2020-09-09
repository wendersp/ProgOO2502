/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0809;

/**
 *
 * @author wender
 */
public class Carro {
    
    String modelo;
    String cor;
    
    public Carro() {
        
    }
    
    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public void ligar() {
        System.out.println("Carro ligado...");
    }
    
    public void andar() {
        System.out.println("Carro andando....");
    }
    
    public void parar() {
        System.out.println("Carro parado...");
    }
    
    public void desligar() {
        System.out.println("Carro desligado...");
    }
    
    public void info() {
        System.out.println("---[info]-----------------");
        System.out.println("modelo: " + modelo);
        System.out.println("cor: " + cor);
        System.out.println("---------------------------");
    }
    
}
