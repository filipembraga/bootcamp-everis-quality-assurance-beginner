package datas;

import java.util.Date;

public class ProgramaConstrutor {
    public static void main(String[] args) {

        //Exemplo de utilização do construtor com passagem de parametro em milisegundos
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1563127311564

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jul 14 15:01:51 BRT 2019

    }
}
