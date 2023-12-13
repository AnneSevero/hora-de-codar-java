package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alunosAprovados = 0;
        do {
            int soma = 0;
            for (int i = 0; i < 6; i++) {
                System.out.println("Digite a " + (i + 1) + "º nota: ");
                int nota = scanner.nextInt();
                soma += nota;
                if (soma / 6 >= 6.5) {
                }
                System.out.println("Calcular a média de outro aluno Sim/Não?");
            } while (scanner.next().equalsIgnoreCase("S"));
            System.out.println("A quantidade de alunos aprovados é " + alunosAprovados);

        }
}
