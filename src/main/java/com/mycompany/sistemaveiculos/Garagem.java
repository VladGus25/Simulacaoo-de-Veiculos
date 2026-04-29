package com.mycompany.sistemaveiculos;

public class Garagem {
   private Carro[] vagas;
   private int TotalCarros;

   public Garagem(int capacidade){
       this.vagas = new Carro[capacidade];
       this.TotalCarros = 0;
   }
}
