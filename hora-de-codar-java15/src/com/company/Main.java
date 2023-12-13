package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        int soma = 0;
        for (int i = numero1; i <= numero2; i++) {
            soma += i;
        }
        System.out.println("A média dos numeros é " + (soma / (numero2 - numero1)));
    }
}
