
public class Main {
    public static void main(String[] args) {
        // Antes de que sea buscado, el arreglo debe estar ordenado.
        int[] arr = { 1, 3, 4, 6, 7, 12, 15, 16 };
        int objetivo = 15;

        int index = busquedaBinaria(arr, objetivo);

        if (index != -1) {
            System.out.println("El elemento" + objetivo + " se encuentra en el índice " + index);
        } else {
            System.out.println("El elemento" + objetivo + " no se encontró en el arreglo.");
        }
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        // Se definen los extremos del buscador, izquierda y derecha: el primero y el
        // último.
        int izquierda = 0;
        int derecha = arr.length - 1; // Tomando en cuenta siempre que el último es el tamaño del arreglo menos, dado
                                      // que empezamos en 0

        /*
         * Mientras izquierda sea menor a derecha, debido a que vamos a ir acortando
         * indices, ya que a medida que vayamos
         * identificado en qué lado se encuentra el valor, iremos acortando espacios
         * para acercarnos al valor deseado.
         */
        while (izquierda <= derecha) {
            // En esta linea únicamente declaramos el punto medio del arreglo
            int medio = izquierda + (derecha - izquierda) / 2; // 4 + (4-4) / 2 = 4

            // si el valor del indice medio es igual al valor buscado, la función termina y
            // regresa el índice de medio.
            if (arr[medio] == objetivo) {
                return medio;
            }

            // si el valor buscado es mayor al medio, vamos acortando el valor de izquierda,
            // por lo que la próxima vez que
            // el valor de medio sea declarado, se reducirá en su calculo ya que hemos
            // reducido el valor de izquierda
            // pero el valor no es restado sino reasignado por el medio +1
            if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            }
            /*
             * Del mismo modo que en el caso anterior, si este no se encuentra dentro del
             * rango, lo reduce a la mitad del
             * lado derecho del arreglo.
             */
            else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
