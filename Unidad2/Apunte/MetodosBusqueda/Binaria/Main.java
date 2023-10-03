
public class Main {
    public static void main(String[] args) {
        //Antes de que sea buscado, el arreglo debe estar ordenado.
        int[] arr = { 1, 3, 4, 6, 7, 12, 15 };
        int objetivo = 6;

        int index = busquedaBinaria(arr, objetivo);

        if (index != -1) {
            System.out.println("El elemento"+ objetivo +" se encuentra en el índice "+ index);
        } else {
            System.out.println("El elemento"+ objetivo +" no se encontró en el arreglo.");
        }
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arr[medio] == objetivo) {
                return medio;
            }

            if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            }

            else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
