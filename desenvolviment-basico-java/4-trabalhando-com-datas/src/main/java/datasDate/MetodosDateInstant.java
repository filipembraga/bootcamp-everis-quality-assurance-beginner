package datasDate;

import java.time.Instant;
import java.util.Date;

public class MetodosDateInstant {

    //Exemplo de conversão entre Date e Instant
    public static void main(String[] args) {

        Date dataInicio = new Date(1513124807691L);
        Date dataAtual = new Date(System.currentTimeMillis());
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z

        System.out.println("\nData atual nos dois formatos:");
        System.out.println(dataAtual);
        System.out.println(dataAtual.toInstant());
    }
}
