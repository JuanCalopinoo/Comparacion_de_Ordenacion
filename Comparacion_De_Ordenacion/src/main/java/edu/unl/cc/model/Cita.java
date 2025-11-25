package edu.unl.cc.model;

import java.time.LocalDateTime;

public class Cita implements Comparable<Cita> {

    public String id;
    public String apellido;
    public LocalDateTime fechaHora;

    public Cita(String id, String apellido, String fechaHoraTexto) {
        this.id = id;
        this.apellido = apellido;
        this.fechaHora = LocalDateTime.parse(fechaHoraTexto);
    }

    @Override
    public int compareTo(Cita o) {
        return this.fechaHora.compareTo(o.fechaHora);
    }

    @Override
    public String toString() {
        return id + " | Apellido= " + apellido + " | FechaHora= " + fechaHora + "\n";
    }
}



