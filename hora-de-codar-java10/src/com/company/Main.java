package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero2 <= 0) {
            System.out.println("Digite o segundo numero: ");
            numero2 = scanner.nextInt();
        }
        System.out.println("A divisão dos dois numeros é " + (numero1 / numero2));
    }
}

