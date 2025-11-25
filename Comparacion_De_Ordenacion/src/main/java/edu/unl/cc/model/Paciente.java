package edu.unl.cc.model;

public class Paciente implements Comparable<Paciente> {

    private String id;
    private String apellido;
    private int prioridad;

    public Paciente(String id, String apellido, int prioridad) {
        this.id = id;
        this.apellido = apellido;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }

    @Override
    public String toString() {
        return id + " | Apellido= " + apellido + " | Prioridad= " + prioridad + "\n";
    }
}

