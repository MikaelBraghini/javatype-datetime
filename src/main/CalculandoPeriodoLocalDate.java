package main;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculandoPeriodoLocalDate {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.now();
        LocalDate dataFinal = LocalDate.of(2025, 12, 6);

        // Criando Objeto periodo para calcular a diferenca das datas
        Period periodo = Period.between(dataInicial, dataFinal);
        System.out.println("Dias: " + periodo.getDays());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Anos: " + periodo.getYears());

        // Calculando diferenca de datas em dias
        long diferencaEmDias = ChronoUnit.DAYS.between(dataInicial, dataFinal);
        System.out.println("Dias entre as datas: " + diferencaEmDias);
    }
}
