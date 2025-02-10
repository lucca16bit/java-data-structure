package com.lucca.datastructure.pilha.labs;

import java.util.Stack;

public class ConversaoBinario {

    public static void main(String[] args) {
        imprimeResultadoBinario(2);
        imprimeResultadoBinario(4);
        imprimeResultadoBinario(10);
        imprimeResultadoBinario(25);
        imprimeResultadoBinario(10035);

        imprimeResultadoHexaDecimal(25, 16);
        imprimeResultadoHexaDecimal(10035, 8);
        imprimeResultadoHexaDecimal(10035, 16);
    }

    public static void imprimeResultadoBinario(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoHexaDecimal(int numero, int base) {
        System.out.println(numero + " na base: " + base + " é: " + decimalHexadecimal(numero, base));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }

        return numBinario;
    }

    public static String decimalHexadecimal(int numero, int base) {

        if (base > 16) {
            throw new IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numBase += bases.charAt(pilha.pop());
        }

        return numBase;
    }
}
