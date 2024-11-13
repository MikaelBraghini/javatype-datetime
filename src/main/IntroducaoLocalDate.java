package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IntroducaoLocalDate {
    public static void main(String[] args) {
        // Pegando a data atual do maquina
        LocalDate today = LocalDate.now();
        System.out.println("Data Atual: " + today);

        // Somando 10 dias na data atual
        LocalDate somandoDezDias = today.plusDays(10);
        System.out.println("Data após adicionar 10 dias: " + somandoDezDias);

        // Subtraido 2 meses na data atual
        LocalDate subtraindoDoisMeses = today.minusMonths(2);
        System.out.println("Data após subtrair 2 meses: " + subtraindoDoisMeses);

        // Somando 1 ano na data atual
        LocalDate somandoUmAno = today.plusYears(1);
        System.out.println("Data após adicionar 1 ano: " + somandoUmAno);

        // Formatando padrao de data
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConvertida = LocalDate.parse("31/10/2023", padrao);
        System.out.println("\nData Convertida: " + dataConvertida);

    }
}
