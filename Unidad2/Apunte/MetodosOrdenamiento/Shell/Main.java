
public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 5, 6, 7, 3, 1, 15, };
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        //int iteracion = 0;
        for (int brecha = arr.length / 2; brecha > 0; brecha /= 2) {
            //System.out.println("Iteración: "+(++iteracion));
            for (int i = brecha; i < arr.length; i++) {
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
