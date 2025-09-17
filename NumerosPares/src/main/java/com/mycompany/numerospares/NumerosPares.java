/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares;

/**
 *
 * @author Gomes
 */
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner np = new Scanner(System.in); 

        System.out.print("Informe o valor inicial: "); // adicionar valor inicial
        int inicio = np.nextInt();

        System.out.print("Informe o valor final: ");// valor final para usar
        int fim = np.nextInt();

        int soma = 0;

        do {
            if (inicio % 2 != 0) { // if com a conta 
                soma += inicio;
            }
            inicio++;
        } while (inicio <= fim);

        System.out.println("Soma dos números ímpares no intervalo: " + soma);

        np.close();
    }
}