public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 5, 10, 6, 7, 3, 1, 15 };
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
        int tamanioIzquierda = left.length;
        int tamanioDerecha = right.length;
        int iIzquierda = 0, iDerecha = 0, iPrincipal = 0;

        // Combina los elementos de left y right en el arreglo arr
        while (iIzquierda < tamanioIzquierda
                && iDerecha < tamanioDerecha) {
            if (left[iIzquierda] <= right[iDerecha]) {
                arr[iPrincipal++] = left[iIzquierda++];
            } else {
                arr[iPrincipal++] = right[iDerecha++];
            }
        }

        // Copia los elementos restantes de left (si los hay)
        while (iIzquierda < tamanioIzquierda) {
            arr[iPrincipal++] = left[iIzquierda++];
        }

        // Copia los elementos restantes de right (si los hay)
        while (iDerecha < tamanioDerecha) {
            arr[iPrincipal++] = right[iDerecha++];
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
