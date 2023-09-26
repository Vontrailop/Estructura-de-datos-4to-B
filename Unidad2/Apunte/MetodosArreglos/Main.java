public class Main {

    public static void main(String args[]) {

        // Split conocido : De string
        String[] palabras = "Mi nombre es David, Yo soy Profesor, Imparto la materia de programación".split(", ");
        for (String string : palabras) {
            // System.out.println(string);
        }

        // Split array

        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int n = a.length;

        int pos = 4;

        if (pos > 0 && pos < n) {

            int b[] = new int[pos];
            int c[] = new int[n - pos];

            for (int i = 0; i < pos; i++) {
                b[i] = a[i];
            }

            for (int i = 0; i < n - pos; i++) {
                c[i] = a[i + pos];
            }

            for (int i : c) {
                // System.out.println(i);
            }
            for (int i : b) {
                // System.out.println(i);
            }
        }

        else {
            System.out.println("error tamaño");
        }

        // merge
        int[] arr1 = { 1, 4, 5, 6 };
        int[] arr2 = { 3, 4, 2, 1 };

        /*
         * arraycopy (arreglo al que se va a copiar,
         * posición del primer arreglo donde se determina la copia,
         * arreglo a donde se va a copiar,
         * posición del arreglo destino donde se van a agregar los items,
         * número de elementos de los arreglos que se van a copiar -del arreglo que se
         * va a copiar-
         * )
         */
        int[] arrSuma = new int[8];
        System.arraycopy(arr1, 0, arrSuma, 0, 4);
        System.arraycopy(arr2, 0, arrSuma, arr1.length, 4);
        for (int i : arrSuma) {
            System.out.println(i);
        }
    }

}