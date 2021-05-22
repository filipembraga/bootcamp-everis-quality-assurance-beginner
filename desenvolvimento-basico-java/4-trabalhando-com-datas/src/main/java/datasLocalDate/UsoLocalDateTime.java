package datasLocalDate;

import java.time.LocalDateTime;

public class UsoLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2021-05-19T18:00:19.331684200

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2021-05-21T19:00:31.331684200

    }
}
