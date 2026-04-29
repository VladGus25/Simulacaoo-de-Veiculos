package com.mycompany.sistemaveiculos;


public class Veiculos {
    private String modelo;
    private String marca;
    private float velocidade;
        
        public Veiculos (String modelo, String marca, float velocidade){
                this.modelo = modelo;
                this.marca = marca;
                this.velocidade = 0;
}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public float getVelocidade() {
        return velocidade;
    }
}
