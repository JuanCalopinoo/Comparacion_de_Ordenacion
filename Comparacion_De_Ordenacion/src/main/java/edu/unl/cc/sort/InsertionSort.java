package edu.unl.cc.sort;

public final class InsertionSort {

    public <T extends Comparable<T>> void insertionSort(T[] array) {
        int swaps = 0;
        int comparisons = 0;

        for (int i = 1; i < array.length; i++) {
            comparisons++;
            T key = array[i];
            int j = i - 1;

            comparisons++;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                comparisons++;
                array[j + 1] = array[j];
                swaps++;
                j--;

            }
            array[j + 1] = key;
            swaps++;
        }

        System.out.println("InsertionSort - Total de swaps = " + swaps);
        System.out.println("InsertionSort - Total de comparaciones = " + comparisons);
    }
}


