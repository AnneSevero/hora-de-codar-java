package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero: ");
        int numero4 = scanner.nextInt();
        System.out.println("Digite o quinto numero: ");
        int numero5 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero2));
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero2 + numero3));
        } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero3));
        } else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero4));
        } else {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero5));
        }
    }
}
