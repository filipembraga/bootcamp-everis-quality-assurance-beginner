package br.com.digital.innovation.one.paradigmaFuncional;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] values = {1,2,3,4};

        //Paradigma Funcional
        Arrays.stream(values)
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(number -> System.out.println(number));
    }
}
