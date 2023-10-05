public class Main {

    public static void main(String[] args) {
        int[] arr = { 4, 6, 12, 32, 45, 6, 7, 2 };
        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void quickSort(int[] arr, int bajo, int alto) {

        if (bajo < alto) {
            int indicePivote = particion(arr, bajo, alto);
            quickSort(arr, bajo, indicePivote - 1);
            quickSort(arr, indicePivote + 1, alto);
        }

    }

    public static int particion(int[] arr, int bajo, int alto) {
        int pivote = arr[alto];
        int masPequenio = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arr[j] <= pivote) {
                masPequenio++;
                int temp = arr[masPequenio];
                arr[masPequenio] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[masPequenio + 1];
        arr[masPequenio + 1] = arr[alto];
        arr[alto] = temp;
        return masPequenio + 1;
    }

}
