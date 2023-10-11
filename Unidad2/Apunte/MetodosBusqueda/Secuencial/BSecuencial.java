
public class BSecuencial {

    public static void main(String[] args) {

        int[] arr = { 12, 4, 5, 6, 7, 3, 1, 15 };
        int objetivo = 6;

        int indice = busqueda(arr, objetivo);

        if (indice != -1) {
            System.out.println("El elemento " + objetivo + " está en el indice " + indice);
        } else {
            System.out.println("El elemento " + objetivo + " no se encuentra en el arreglo.");
        }
    }

    public static int busqueda(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

}
