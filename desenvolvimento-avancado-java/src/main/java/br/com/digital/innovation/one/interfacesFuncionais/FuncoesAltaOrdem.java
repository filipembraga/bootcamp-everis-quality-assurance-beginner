package br.com.digital.innovation.one.interfacesFuncionais;

public class FuncoesAltaOrdem  {
    public static void main(String[] args) {
        CalculoB soma =  ( a, b) -> a+b;
        CalculoB subtracao =  ( a, b) -> a-b;
        CalculoB multiplicacao =  ( a, b) -> a*b;
        CalculoB divisao =  ( a, b) -> a/b;

        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(subtracao,1,3));
        System.out.println(executarOperacao(multiplicacao,1,3));
        System.out.println(executarOperacao(divisao,5,3));

    }

    public static int executarOperacao(CalculoB calculoB,int a, int b){
        return calculoB.calcular(a,b);
    }
}

@FunctionalInterface
interface CalculoB {
    public int calcular(int a, int b);
}