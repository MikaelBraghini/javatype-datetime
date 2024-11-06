package main;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class IntroducaoLocalDateTime {
    public static void main(String[] args) {
        // Criando uma data e hora atuais
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);

        // Adicionando 5 dias e 3 horas à data/hora atual
        LocalDateTime dataHorafutura = dataHoraAtual.plusDays(5).plusHours(3);
        System.out.println("\nData e hora após adicionar 5 dias e 3 horas: " + dataHorafutura);

        // Subtraindo 2 horas e 30 minutos
        LocalDateTime dataHoraPassado = dataHoraAtual.minusHours(2).minusMinutes(30);
        System.out.println("\nData e hora após subtrair 2 horas e 30 minutos: " + dataHoraPassado);

        // Calculando a diferença em horas entre duas datas/horas
        long diferencaEmHoras = ChronoUnit.HOURS.between(dataHoraPassado, dataHorafutura);
        System.out.println("\nDiferença em horas: " + diferencaEmHoras);

        // Calculando a diferença em dias entre duas datas/horas
        long diferencaEmDias = ChronoUnit.DAYS.between(dataHoraPassado, dataHorafutura);
        System.out.println("\nDiferença em dias: " + diferencaEmDias);
    }
}
