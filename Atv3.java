/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv3;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Atv3 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

       
        System.out.print("Informe o coeficiente a: ");
        double a = entrada.nextDouble();
        System.out.print("Informe o coeficiente b: ");
        double b = entrada.nextDouble();
        System.out.print("Informe o coeficiente c: ");
        double c = entrada.nextDouble();

        
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa e uma equacao de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Raiz: " + raiz);
        } else {
            
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equacao nao possui raizes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equacaoo possui duas raizes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("Raiz: " + raiz);
            } else {
                System.out.println("Esta equacao possui duas raizes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        entrada.close();
    }
}
