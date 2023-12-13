package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota: ");
            int nota = scanner.nextInt();
            soma += nota;
        }
        if (soma / 4 >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }
    }
}
