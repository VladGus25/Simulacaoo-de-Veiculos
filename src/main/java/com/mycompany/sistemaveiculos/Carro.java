package com.mycompany.sistemaveiculos;

public class Carro extends Veiculos{
    private int portas;
    
    public Carro (String modelo, String marca, float velocidade, int portas){
        super(modelo, marca, velocidade);
        this.portas = portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getPortas() {
        return portas;
    }
}
