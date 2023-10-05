public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 6, 7, 3, 1, 15};
        mergeSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return; // No se requiere ordenamiento si el arreglo tiene 0 o 1 elemento
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Copiar elementos a los subarreglos izquierdo y derecho
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);

        // Recursivamente ordenar los subarreglos
        mergeSort(left);
        mergeSort(right);

        // Combinar los subarreglos ordenados
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int nLeft = left.length;
        int nRight = right.length;
        int i = 0, j = 0, k = 0;

        // Combina los elementos de left y right en el arreglo arr
        while (i < nLeft && j < nRight) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copia los elementos restantes de left (si los hay)
        while (i < nLeft) {
            arr[k++] = left[i++];
        }

        // Copia los elementos restantes de right (si los hay)
        while (j < nRight) {
            arr[k++] = right[j++];
        }
    }
}
