package br.com.digital.innovation.one.paradigmaFuncional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int value = 20;
        UnaryOperator<Integer> returnDouble = v -> v * 2;
        System.out.println(returnDouble.apply(value)); // return double value
        System.out.println(value); // value dont modify
    }
}
