package edu.unl.cc;

import edu.unl.cc.csv.CSVLoader;
import edu.unl.cc.model.Cita;
import edu.unl.cc.model.ItemInventario;
import edu.unl.cc.model.Paciente;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("[------ Bienvenido al sistema de comparacion de algoritmos de ordenacion ------]");

        /* --------- CARGAMOS LAS CITAS ---------- */
        Cita[] citas = CSVLoader.loadCitas("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\citas_100.csv");
        System.out.println("Citas cargadas: " + citas.length);

        /* --------- CARGAMOS LAS CITAS CASI ORDENADAS ---------- */
        Cita[] citasCasiOrdenadas = CSVLoader.loadCitas("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\citas_100_casi_ordenadas.csv");
        System.out.println("Citas casi ordenadas cargadas: " + citasCasiOrdenadas.length);

        /* --------- CARGAMOS LOS PACIENTES ---------- */
        Paciente[] pacientes = CSVLoader.loadPacientes("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\pacientes_500.csv");
        System.out.println("Pacientes cargados: " + pacientes.length);

        /* --------- CARGAMOS EL INVENTARIO ---------- */
        ItemInventario[] items = CSVLoader.loadInventario("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\inventario_500_inverso.csv");
        System.out.println("Inventario cargado: " + items.length);

    }
}
