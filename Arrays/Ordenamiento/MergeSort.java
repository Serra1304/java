package com.nuwe.app;

public class MergeSort {
    // // Método mergeSort principal
    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length - 1);
    }

    // Método mergeSort recursivo
    public static void merge(int[] arr, int left, int mid, int right) {
        // Encuentra los tamaños de los subarrays para fusionar
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crear arrays temporales
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia los datos a los arrays temporales
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        // Indices iniciales de los primeros y segundo subarrays
        int i = 0, j = 0;

        // Indice inicial del array fusionado
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de L[] si hay alguno
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de R[] si hay alguno
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Método merge para combinar los subarrays
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Encuentra el punto medio
            int mid = (left + right) / 2;

            // Ordenar la primera y segunda mitad
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Combina las dos mitades
            merge(arr, left, mid, right);
        }
    }
}
