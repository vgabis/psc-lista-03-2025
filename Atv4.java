/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv4;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Atv4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.141592;
        
        System.out.println("Digite 1 para: Calcular e imprimir o perimetro do circulo. ");
        System.out.println("Digite 2 para: Calcular e imprimir a area do circulo. ");
        System.out.println("Digite 3 para: Calcular e imprimir o volume da esfera. ");

      
        System.out.print("Informe o codigo da operacao (1, 2 ou 3): ");
        int operacao = entrada.nextInt();
        System.out.print("Informe o raio: ");
        double raio = entrada.nextDouble();

        
        switch (operacao) {
            case 1:
                double perimetro = calcularPerimetro(raio, PI);
                System.out.println("Perimetro do circulo: " + perimetro);
                break;
            case 2:
                double area = calcularArea(raio, PI);
                System.out.println("Area do circulo: " + area);
                break;
            case 3:
                double volume = calcularVolume(raio, PI);
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.out.println("Codigo da operação invalido.");
        }

        entrada.close();
    }

    public static double calcularPerimetro(double raio, double pi) {
        return 2 * pi * raio;
    }

    public static double calcularArea(double raio, double pi) {
        return pi * raio * raio;
    }

    public static double calcularVolume(double raio, double pi) {
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }
    
}
