/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Atv1 {

    public static void main(String[] args) {        
        
	Scanner entrada = new Scanner(System.in);
	int a = 0, maior = 0, menor = 0, media;

	for(int x = 0; x < 3; x++){
		
		System.out.println("Insira um valor:");
		a = entrada.nextInt();
		
		if(x == 0){
			
			maior = a;
			menor = a;
		}
		
		if(a > maior){
			
			maior = a;
		}
		
		if(a < menor){
			
			menor = a;
		}
	}
	
	System.out.println("Maior: "+ maior +" Menor: " + menor);
        media =( a + menor + maior )/3;
        System.out.println(" A media dos numeros e: " + media);

}
    }

