package br.com.digital.innovation.one.interfacesFuncionais;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Joao"));
    }
}
