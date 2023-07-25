package br.com.claudemir.algoritmos;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println("Lista original:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nLista ordenada:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // A lista está vazia ou possui apenas um elemento, já está ordenada
        }

        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] tempArr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, tempArr, left, mid);
            mergeSort(arr, tempArr, mid + 1, right);
            merge(arr, tempArr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] tempArr, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tempArr[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }

        while (j <= right) {
            arr[k] = tempArr[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
