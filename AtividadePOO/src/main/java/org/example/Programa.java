package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Carro modelo = new Carro();//instancia

        System.out.println("Digite a marca, modelo e velocidade:");
        modelo.marca = sc.nextLine();
        modelo.modelo = sc.nextLine();
        modelo.velocidade = sc.nextDouble();

        modelo.acelerar();
        modelo.acelerar();

        System.out.println("Dados do seu carro: " + modelo.exibirDados() );
        sc.close();
    }
}