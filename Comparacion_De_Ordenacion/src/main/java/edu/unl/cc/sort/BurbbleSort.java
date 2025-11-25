package edu.unl.cc.sort;

public final class BurbbleSort {

    public <T extends Comparable<T>> void burbbleSort(T[] array) {
        int pasadas = 0;
        int swaps = 0;
        int comparisons = 0;

        for (int i = 0; i < array.length - 1; i++) {
            pasadas++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                comparisons++;
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swaps++;
                }
            }
        }
        System.out.println("BubbleSort - Total de pasadas = " + pasadas);
        System.out.println("BubbleSort - Total de swaps = " + swaps);
        System.out.println("BubbleSort - Total de comparaciones = " + comparisons);
    }
}


