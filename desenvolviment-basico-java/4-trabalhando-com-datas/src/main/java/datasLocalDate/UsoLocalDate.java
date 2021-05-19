package datasLocalDate;

import java.time.LocalDate;

public class UsoLocalDate {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2021-05-19

        System.out.println(ontem);
        // 2021-05-18

    }
}
