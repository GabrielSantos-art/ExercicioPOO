package org.example;

public class Carro {

    public String marca;
    public String modelo;
    public Double velocidade;

    public String exibirDados() {

        return "Marca: " + marca + " | Modelo: " + modelo + " | Velocidade atual: " + velocidade;
    }

    public double acelerar() {
        velocidade = velocidade + 10;
        return velocidade;
    }
}
