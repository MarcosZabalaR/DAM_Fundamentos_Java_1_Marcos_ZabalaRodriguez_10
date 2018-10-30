package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, por favor introduzca un número entre 0 y 9999.");
        int x = sc.nextInt();
        check(x);
    }

    private static void check(int x) {
        if (x < 0 || x > 9999) {
            System.out.println("Número no válido.");
        } else {
            String numero = String.valueOf(x);
            System.out.println("El tamaño del número es: " + numero.length());
        }
    }
}