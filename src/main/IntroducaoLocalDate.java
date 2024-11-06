package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IntroducaoLocalDate {
    public static void main(String[] args) {
        // Pegando a data atual do maquina
        LocalDate today = LocalDate.now();
        System.out.println("Data Atual: " + today);

        // Somando 10 dias na data atual
        LocalDate datePlus10Days = today.plusDays(10);
        System.out.println("Data após adicionar 10 dias: " + datePlus10Days);

        // Subtraido 2 meses na data atual
        LocalDate dateMinus2Months = today.minusMonths(2);
        System.out.println("Data após subtrair 2 meses: " + dateMinus2Months);

        // Somando 1 ano na data atual
        LocalDate dateNextYear = today.plusYears(1);
        System.out.println("Data após adicionar 1 ano: " + dateNextYear);

        // Formatando padrao de data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConvertida = LocalDate.parse("31/10/2023", formatter);
        System.out.println("\nData Convertida: " + dataConvertida);

    }
}
