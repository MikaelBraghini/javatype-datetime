package main;

import java.time.LocalTime;

public class IntroducaoLocalTime {
    public static void main(String[] args) {
        // Criando o objeto do tipo LocalTime
        LocalTime now = LocalTime.now();
        System.out.println("Hora atual: " + now);

        // Adicionando 2 horas e 30 minutos na hora atual
        LocalTime horasSomadas = now.plusHours(2).plusMinutes(30);
        System.out.println("Hora após adicionar 2 horas e 30 minutos: " + horasSomadas);

        // Subtraindo 15 minutos na hora atual
        LocalTime horasSubtraidas = now.minusMinutes(15);
        System.out.println("Hora após subtrair 15 minutos: " + horasSubtraidas);


        // Formatando hora para o padrao desejado
        int hora = horasSomadas.getHour();
        int minuto = horasSomadas.getMinute();
        int segundo = horasSomadas.getSecond();

        System.out.printf("%d:%d:%d", hora, minuto, segundo);
    }
}
