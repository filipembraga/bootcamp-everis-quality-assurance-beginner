package one.innovation.digital.exemplohashcode;

public class Programa {
    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        System.out.println(carro1 == carro2); //false
        System.out.println(carro1.equals(carro2)); //true

    }

}
