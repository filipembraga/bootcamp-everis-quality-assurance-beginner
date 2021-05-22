package one.digitalinnovation.interfaces;

public class Fiesta implements Carro, Veiculo { //Implements two Interfaces

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "12312g324234";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }
}
