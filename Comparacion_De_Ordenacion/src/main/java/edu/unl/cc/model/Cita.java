package edu.unl.cc.model;


public class Cita implements Comparable<Cita> {
    public String id;
    public String apellido;
    public String fechaHora; // formato ISO 2025-03-05T10:40

    public Cita(String id, String apellido, String fechaHora) {
        this.id = id;
        this.apellido = apellido;
        this.fechaHora = fechaHora;
    }

    public int compareTo(Cita o) {
        return this.fechaHora.compareTo(o.fechaHora);
    }
    @Override
    public String toString() {
        return id + " |Apellido= " + apellido + " |Fecha_Hora= " + fechaHora + "\n";
    }
}

