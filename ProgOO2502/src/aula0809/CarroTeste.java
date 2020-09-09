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
public class CarroTeste {
  public static void main(String[] args) {
      Carro carro1 = new Carro();
      Carro carro2 = new Carro();
      
      Carro carro3, carro4;
      carro3 = new Carro("Fusca", "preto");
      carro4 = new Carro();
      
      
      carro1.cor = "preto";
      carro1.modelo = "gol";
      
      carro2.cor = "branco";
      carro2.modelo = "parati";
      
      carro1.info();
      carro1.ligar();
      carro1.andar();
      carro1.parar();
      carro1.desligar();
      
      carro2.info();
      carro2.ligar();
      carro2.andar();
      carro2.parar();
      carro2.desligar();
      
      carro3.info();
            
      
  }
    
}
