/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Atv2 {

    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
                  
        System.out.println("Valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();
        System.out.println("Valor pago: R$ ");
        double valorPago = entrada.nextDouble();
        
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        } else {
    
            int troco = (int) (valorPago - valorCompra);
            System.out.println("Troco: R$ " + troco);
                       
            int[] notas = {50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];

            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = troco / notas[i];
                troco %= notas[i];
            }
                    
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println("Notas de R$ " + notas[i] + ": " + quantidadeNotas[i]);
                }
            }
        }

        entrada.close();
    }
}
