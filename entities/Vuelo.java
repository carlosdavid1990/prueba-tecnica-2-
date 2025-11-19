package entities;

import java.time.LocalDate;
public class Vuelo {
    private int id;
    private final String nombreVuelo;
    private final String empresa;
    private final String lugarSalida;
    private final String lugarLlegada;
    private final LocalDate fechaSalida;
    private final LocalDate fechaLlegada;

    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public int getId() {
        return id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
    @Override
    public String toString() {
        return "\n--- DETALLE DEL VUELO ---\n"
                + nombreVuelo + " ★\n" +
                " ✈ Compañía:     " + empresa + "\n" +
                " 🛫 Origen:       " + lugarSalida + " — " + fechaSalida + "\n" +
                " 🛬 Destino:      " + lugarLlegada + " — " + fechaLlegada + "\n" +
                " ID Registro:     " + id + "\n" +
                "───────────────────────────────────────";
    }



}



