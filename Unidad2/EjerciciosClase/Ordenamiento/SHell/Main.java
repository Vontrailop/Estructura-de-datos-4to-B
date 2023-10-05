public class Main {
    public static void main(String[] args) {
        int[] arr = { 15, 6, 8, 9, 7, 6, 5, 15 };

        shell(arr);

        for (int i : arr) {
            System.out.print(i + ", ");
        }

    }

    public static void shell(int[] arr) {

        int acumulador = 0;
        for (int brecha = arr.length / 2; brecha > 0; brecha /= 2) {
            //Va a realizar la división de la variable brecha
            System.out.println("Iteraciones: " + (++acumulador));
            for (int i = brecha; i < arr.length; i++) {
                System.out.println(i);
                int temp = arr[i];
                int j;
                for (j = i; j >= brecha && arr[j - brecha] > temp; j -= brecha) {
                    arr[j] = arr[j - brecha];
                }
                arr[j] = temp;
            }
        }
    }
}
