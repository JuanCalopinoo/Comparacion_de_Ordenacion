package edu.unl.cc.model;

public class Paciente {
    private String Id;
    private String apellido;
    private int prioridad;

    public Paciente(String id, String apellido, int prioridad) {
        Id = id;
        this.apellido = apellido;
        this.prioridad = prioridad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return Id + " |Apellido= " + apellido + " |Prioridad= " + prioridad + "\n";
    }
}
