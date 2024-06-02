package com.nuwe.app;

public class QuickSort {

    // Método principal quickSort
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    // Método quickSort recursivo
    public static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            // Partición del array
            int pi = partition(arr, low, high);

            // Ordenar los subarrays de forma recursiva
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Método para dividir el array y encontrar el punto de partición
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];  // Elegir el pivote (último elemento)
        int i = (low - 1);  // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivot) {
                i++;
                // Intercambiar arr[i] y arr[j]
                swap(arr, i, j);
            }
        }

        // Intercambiar arr[i + 1] y arr[high] (o el pivote)
        swap(arr, i + 1, high);

        return i + 1;
    }

    // Método para intercambiar dos elementos en el array
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
