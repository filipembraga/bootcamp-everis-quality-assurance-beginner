package one.digital.innovation;

import one.digital.innovation.imc.CalculadorDeImc;
import one.digital.innovation.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("André", 1.9, 100.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }
}
