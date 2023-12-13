package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double anacleto = 1.5;
        double felisberto = 1.1;
        int anos = 0;
        while (felisberto < anacleto) {
            anacleto += 0.02;
            felisberto += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto");
    }
}
