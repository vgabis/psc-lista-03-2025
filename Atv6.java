/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Atv6 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Random random = new Random();

        
        System.out.print("Informe o primeiro numero inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("Informe o segundo numero inteiro: ");
        int num2 = entrada.nextInt();

        
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        
        int numeroSorteado = random.nextInt((maior - menor) + 1) + menor;

        
        if (numeroSorteado % 2 == 0) {
            System.out.println("Numero sorteado: " + numeroSorteado + " - Ele e par.");
        } else {
            System.out.println("Numero sorteado: " + numeroSorteado + " - Ele e impar.");
        }

        entrada.close();
    }
}
