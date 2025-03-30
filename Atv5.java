/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv5;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Atv5 {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);

       
        System.out.print("Informe o primeiro numero: ");
        double num1 = entrada.nextDouble();
        System.out.print("Informe o segundo numero: ");
        double num2 = entrada.nextDouble();

      
        System.out.print("Informe a operacao (+, -, *, /, ^): ");
        char operacao = entrada.next().charAt(0);

      
        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisao por zero nao e permitida.");
                }
                break;
            case '^':
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Simbolo da operacao invalido.");
        }

        entrada.close(); 

       
    }
}
