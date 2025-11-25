package edu.unl.cc.sort;

public final class InsertionSort {

    public <T extends Comparable<T>> void insertionSort(T[] array) {
        int movimientos = 0;
        int comparisons = 0;

        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
                movimientos++;
                comparisons++;
            }
            array[j + 1] = key;
        }

        System.out.println("InsertionSort - Total de movimientos = " + movimientos);
        System.out.println("InsertionSort - Total de comparaciones = " + comparisons);
    }
}


