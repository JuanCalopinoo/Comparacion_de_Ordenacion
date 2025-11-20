package edu.unl.cc.csv;

import edu.unl.cc.model.Cita;
import edu.unl.cc.model.ItemInventario;
import edu.unl.cc.model.Paciente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CSVLoader {

    // ------------------- CITAS -------------------
    public static Cita[] loadCitas(String path) throws Exception {
        List<Cita> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine(); // encabezado

        while ((line = br.readLine()) != null) {
            String[] p = line.split(";");
            if (p.length < 3) continue;

            lista.add(new Cita(p[0], p[1], p[2]));
        }
        br.close();
        return lista.toArray(new Cita[0]);
    }

    // ------------------- PACIENTES -------------------
    public static Paciente[] loadPacientes(String path) throws Exception {
        List<Paciente> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));

        br.readLine(); // encabezado

        String line;
        while ((line = br.readLine()) != null) {
            String[] p = line.split(";");
            if (p.length < 3) continue;

            lista.add(new Paciente(
                    p[0],
                    p[1],
                    Integer.parseInt(p[2])
            ));
        }
        br.close();
        return lista.toArray(new Paciente[0]);
    }

    // ------------------- INVENTARIO -------------------
    public static ItemInventario[] loadInventario(String path) throws Exception {
        List<ItemInventario> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));

        br.readLine(); // encabezado

        String line;
        while ((line = br.readLine()) != null) {
            String[] p = line.split(";");
            if (p.length < 3) continue;

            lista.add(new ItemInventario(
                    p[0],
                    p[1],
                    Integer.parseInt(p[2])
            ));
        }
        br.close();
        return lista.toArray(new ItemInventario[0]);
    }
}
