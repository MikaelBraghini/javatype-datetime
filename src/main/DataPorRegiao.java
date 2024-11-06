package main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataPorRegiao {
    public static void main(String[] args) {

        // Data e hora atual no fuso horário local
        ZonedDateTime dataAtual = ZonedDateTime.of(LocalDateTime.parse("2024-11-06"), ZoneId.of("America/New_York"));
        System.out.println("Data e hora atual (fuso local): " + dataAtual);

        // Mudando para o fuso horário de Nova York
        ZonedDateTime dataEmNy = dataAtual.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data e hora em Nova York: " + dataEmNy);

        // Mudando para o fuso horário de Tóquio
        ZonedDateTime dataEmTokyo = dataAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Data e hora em Tóquio: " + dataEmTokyo);
    }
}
