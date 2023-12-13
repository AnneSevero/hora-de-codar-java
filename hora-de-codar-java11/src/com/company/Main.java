package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        System.out.println("A média dos numeros é " + (soma / 10));
    }
    }