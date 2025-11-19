import entities.Vuelo;
import utils.FiltroVuelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final LocalDate fecha_inicio = LocalDate.of(2025, 5, 15);
    private static final LocalDate fecha_fin = LocalDate.of(2025, 5, 30);

    public static void main(String[] args) {

        List<Vuelo> vuelos = crearListaVuelos();



        System.out.println("\n=== VUELOS FILTRADOS ===");
        List<Vuelo> filtrados = FiltroVuelos.filtrarVuelos(vuelos, fecha_inicio, fecha_fin);
        filtrados.forEach(System.out::println);
    }

    private static List<Vuelo> crearListaVuelos() {

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires",
                LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 11)));

        vuelos.add(new Vuelo(2, "H002-V", "Turkish", "Estambul", "New York",
                LocalDate.of(2025, 5, 15), LocalDate.of(2025, 5, 16)));

        vuelos.add(new Vuelo(3, "H003-V", "Air France", "París", "Tokio",
                LocalDate.of(2025, 5, 18), LocalDate.of(2025, 5, 19)));

        vuelos.add(new Vuelo(4, "H004-V", "Iberia", "Madrid", "Londres",
                LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 20)));

        vuelos.add(new Vuelo(5, "H005-V", "LATAM", "Santiago", "Madrid",
                LocalDate.of(2025, 5, 22), LocalDate.of(2025, 5, 23)));

        vuelos.add(new Vuelo(6, "H006-V", "Delta", "New York", "París",
                LocalDate.of(2025, 5, 25), LocalDate.of(2025, 5, 26)));

        vuelos.add(new Vuelo(7, "H007-V", "Emirates", "Dubái", "Roma",
                LocalDate.of(2025, 5, 27), LocalDate.of(2025, 5, 27)));

        vuelos.add(new Vuelo(8, "H008-V", "Lufthansa", "Berlín", "Lima",
                LocalDate.of(2025, 5, 30), LocalDate.of(2025, 5, 31)));

        vuelos.add(new Vuelo(9, "H009-V", "Qatar Airways", "Doha", "Sídney",
                LocalDate.of(2025, 6, 2), LocalDate.of(2025, 6, 3)));

        vuelos.add(new Vuelo(10, "H010-V", "American Airlines", "Los Ángeles", "México DF",
                LocalDate.of(2025, 4, 28), LocalDate.of(2025, 4, 28)));

        return vuelos;
    }
}
