package utils;

import entities.Vuelo;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelos {

    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechaFin) {

        validarListaVuelos(vuelos);
        validarRangoFechas(fechaInicio, fechaFin);
        validarFechasDeCadaVuelo(vuelos);

        return vuelos.stream()
                .filter(vuelo -> cumpleRango(vuelo, fechaInicio, fechaFin))
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }




    private static void validarListaVuelos(List<Vuelo> vuelos) {
        if (vuelos == null) {
            throw new IllegalArgumentException("La lista de vuelos no puede ser null.");
        }
    }

    private static void validarRangoFechas(LocalDate inicio, LocalDate fin) {
        if (inicio != null && fin != null && inicio.isAfter(fin)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser mayor que la fecha final.");
        }
    }

    private static void validarFechasDeCadaVuelo(List<Vuelo> vuelos) {
        vuelos.stream()
                .filter(v -> v.getFechaSalida().isAfter(v.getFechaLlegada()))
                .findAny()
                .ifPresent(v -> {
                    throw new IllegalArgumentException(
                            "El vuelo " + v.getNombreVuelo() + " tiene una fecha de llegada anterior a la salida."
                    );
                });
    }

    private static boolean cumpleRango(Vuelo vuelo, LocalDate inicio, LocalDate fin) {
        LocalDate salida = vuelo.getFechaSalida();
        LocalDate llegada = vuelo.getFechaLlegada();

        return (salida.isEqual(inicio) || salida.isAfter(inicio)) &&
                (salida.isEqual(fin)    || salida.isBefore(fin));
    }


}

