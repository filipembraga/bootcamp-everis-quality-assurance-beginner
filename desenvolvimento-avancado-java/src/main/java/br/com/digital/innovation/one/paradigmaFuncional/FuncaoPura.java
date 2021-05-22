package br.com.digital.innovation.one.paradigmaFuncional;

import java.util.function.BiPredicate;

public class FuncaoPura {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> verifyIfMajor =
                (parameter, valueComparation) -> parameter > valueComparation;

        System.out.println(verifyIfMajor.test(13,12));
        System.out.println(verifyIfMajor.test(13,12));
    }
}
