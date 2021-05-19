package datasLocalDate;

import java.time.LocalTime;

public class UsoLocalTime {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 17:59:31.064905700

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 18:59:31.064905700

    }
}
