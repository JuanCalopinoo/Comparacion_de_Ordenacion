package edu.unl.cc.sort;

public final class SelectionSort {

    public <T extends Comparable<T>> void selectionSort(T[] array) {
        int swaps = 0;
        int comparisons = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                comparisons ++;
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                swaps++;
            }
        }
        System.out.println("SelectionSort - Total de swaps = " + swaps);
        System.out.println("SelectionSort - Total de comparaciones = " + comparisons);
    }
}


