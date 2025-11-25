package edu.unl.cc;

import edu.unl.cc.csv.CSVLoader;
import edu.unl.cc.model.Cita;
import edu.unl.cc.model.ItemInventario;
import edu.unl.cc.model.Paciente;
import edu.unl.cc.sort.BurbbleSort;
import edu.unl.cc.sort.InsertionSort;
import edu.unl.cc.sort.SelectionSort;

public class Main {

    public static void main(String[] args) throws Exception {
        SelectionSort SS = new SelectionSort();
        BurbbleSort BS = new BurbbleSort();
        InsertionSort IS = new InsertionSort();

        System.out.println("[------ Bienvenido al sistema de comparacion de algoritmos de ordenacion ------]");

        /* --------- CARGAMOS LAS CITAS ---------- */
        Cita[] citas = CSVLoader.loadCitas("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\citas_100.csv");
        System.out.println("=============================== CITAS ORDENADAS ================================");

        /* TIEMPO CON SELECTION SORT*/
        long SSelectionSort1= System.nanoTime();
        SS.selectionSort(citas.clone());
        long ESelectionSort1 = System.nanoTime();
        long tiempoSelectionSort = ESelectionSort1 - SSelectionSort1;
        System.out.println("Tiempo de ejecucion de Selection Sort: " + tiempoSelectionSort + " nanosegundos");

        /*TIEMPO CON INSERTION SORT */
        long SInsertionSort1= System.nanoTime();
        IS.insertionSort(citas.clone());
        long EInsertionSort1 = System.nanoTime();
        long tiempoInsertionSort1 = EInsertionSort1 - SInsertionSort1;
        System.out.println("Tiempo de ejecucion de Insertion Sort: " + tiempoInsertionSort1 + " nanosegundos");

        /*TIMEPO CON BURBLE SORT */
        long SBurbbleSort1= System.nanoTime();
        BS.burbbleSort(citas.clone());
        long EBurbbleSort1 = System.nanoTime();
        long tiempoBurbbleSort1 = EBurbbleSort1 - SBurbbleSort1;
        System.out.println("Tiempo de ejecucion de Burble Sort: " + tiempoBurbbleSort1 + " nanosegundos");

        /*===============================================================================================================*/
        /* --------- CARGAMOS LAS CITAS CASI ORDENADAS ---------- */
        Cita[] citasCasiOrdenadas = CSVLoader.loadCitas("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\citas_100_casi_ordenadas.csv");
        System.out.println("=============================== CITAS CASI ORDENADAS ================================");

        /*TIEMPO CON SELECTION SORT*/
        long SSelectionSort2= System.nanoTime();
        SS.selectionSort(citasCasiOrdenadas.clone());
        long ESelectionSort2 = System.nanoTime();
        long tiempoSelectionSort2 = ESelectionSort2 - SSelectionSort2;
        System.out.println("Tiempo de ejecucion de Selection Sort: " + tiempoSelectionSort2 + " nanosegundos");

        /*TIEMPO CON INSERTION SORT*/
        long SInsertionSort2= System.nanoTime();
        IS.insertionSort(citasCasiOrdenadas.clone());
        long EInsertionSort2 = System.nanoTime();
        long tiempoInsertionSort2 = EInsertionSort2 - SInsertionSort2;
        System.out.println("Tiempo de ejecucion de Insertion Sort: " + tiempoInsertionSort2 + " nanosegundos");

        /*TIEMPO CON BURBBLE SORT*/
        long SBurbbleSort2= System.nanoTime();
        BS.burbbleSort(citasCasiOrdenadas.clone());
        long EBurbbleSort2 = System.nanoTime();
        long tiempoBurbbleSort2 = EBurbbleSort2 - SBurbbleSort2;
        System.out.println("Tiempo de ejecucion de Burble Sort: " + tiempoBurbbleSort2 + " nanosegundos");

        /*=======================================================================================================*/
        /* --------- CARGAMOS LOS PACIENTES ---------- */
        Paciente[] pacientes = CSVLoader.loadPacientes("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\pacientes_500.csv");
        System.out.println("=============================== PACIENTES POR PRIORIDAD (Datos repetidos) ================================");

        /*TIEMPO CON SELECTION SORT*/
        long SSelectionSort3= System.nanoTime();
        SS.selectionSort(pacientes.clone());
        long ESelectionSort3 = System.nanoTime();
        long tiempoSelectionSort3 = ESelectionSort3 - SSelectionSort3;
        System.out.println("Tiempo de ejecucion de Selection Sort: " + tiempoSelectionSort3 + " nanosegundos");

        /*TIEMPO CON INSERTION SORT*/
        long SInsertionSort3= System.nanoTime();
        IS.insertionSort(pacientes.clone());
        long EInsertionSort3 = System.nanoTime();
        long tiempoInsertionSort3 = EInsertionSort3 - SInsertionSort3;
        System.out.println("Tiempo de ejecucion de Insertion Sort: " + tiempoInsertionSort3 + " nanosegundos");

        /*TIEMPO CON BURBBLE SORT*/
        long SBurbbleSort3= System.nanoTime();
        BS.burbbleSort(pacientes.clone());
        long EBurbbleSort3 = System.nanoTime();
        long tiempoBurbbleSort3 = EBurbbleSort3 - SBurbbleSort3;
        System.out.println("Tiempo de ejecucion de Burble Sort: " + tiempoBurbbleSort3 + " nanosegundos");



        /*=====================================================================================================*/
        /* --------- CARGAMOS EL INVENTARIO ---------- */
        ItemInventario[] items = CSVLoader.loadInventario("D:\\Desktop\\Comparacion_de_Ordenacion\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\inventario_500_inverso.csv");
        System.out.println("=============================== INVENTARIO INVERSO ================================");

        /*TIEMPO CON SELECTION SORT*/
        long SSelectionSort4= System.nanoTime();
        SS.selectionSort(items.clone());
        long ESelectionSort4 = System.nanoTime();
        long tiempoSelectionSort4 = ESelectionSort4 - SSelectionSort4;
        System.out.println("Tiempo de ejecucion de Selection Sort: " + tiempoSelectionSort4 + " nanosegundos");

        /*TIEMPO CON INSERTION SORT*/
        long SInsertionSort4= System.nanoTime();
        IS.insertionSort(items.clone());
        long EInsertionSort4 = System.nanoTime();
        long tiempoInsertionSort4 = EInsertionSort4 - SInsertionSort4;
        System.out.println("Tiempo de ejecucion de Insertion Sort: " + tiempoInsertionSort4 + " nanosegundos");

        /*TIEMPO CON BURBBLE SORT*/
        long SBurbbleSort4= System.nanoTime();
        BS.burbbleSort(items.clone());
        long EBurbbleSort4 = System.nanoTime();
        long tiempoBurbbleSort4 = EBurbbleSort4 - SBurbbleSort4;
        System.out.println("Tiempo de ejecucion de Burble Sort: " + tiempoBurbbleSort4 + " nanosegundos");

    }

}
