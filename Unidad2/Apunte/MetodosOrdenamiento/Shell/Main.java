
public class Main {
    public static void main(String[] args) {
        int[] arr = { -12, 4, 5, -6, 7, 3, -1 ,1};
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void shellSort(int[] arr) {
        // int iteracion = 0;
        for (int brecha = arr.length / 2; brecha > 0; brecha /= 2) {
            // System.out.println("Iteración: "+(++iteracion));
            for (int i = brecha; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                System.out.println("Brecha " + brecha);
                for (j = i;
                        /*
                         * Esta condición únicamente revisa que el valor de j no sobrepase a brecha
                         * \/\/\/\/\/
                         */
                        j >= brecha &&
                        /*
                         * esta condición revisa que el valor temp siempre sea menor
                         * que el valor que se encuentra en j. Si existe el caso de que así
                         * sea, vuelve a iterar hasta poder terminar de ordenarlo
                         * \/\/\/\/\/
                         */
                                arr[j - brecha] > temp; j -= brecha) {
                    System.out.println("Iteración " + j);
                    arr[j] = arr[j - brecha];
                }
                arr[j] = temp;
            }
        }
    }
}
