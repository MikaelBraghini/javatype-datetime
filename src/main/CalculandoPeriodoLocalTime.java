package main;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CalculandoPeriodoLocalTime {
    public static void main(String[] args) {
        LocalTime horaInicial = LocalTime.of(10, 0);
        LocalTime horaFinal = LocalTime.of(12, 45);

        // Calculando a duração entre dois horários
        Duration duracao = Duration.between(horaInicial, horaFinal);
        System.out.println("Tempo restante: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");












        LocalTime horaAtual = LocalTime.now();
        LocalTime horaSaida = LocalTime.of(23, 55);

        long duracaoEmMinutos = ChronoUnit.MINUTES.between(horaAtual, horaSaida);
        System.out.printf("Ainda falta %s minutos para irmos embora... ", duracaoEmMinutos);
    }
}
