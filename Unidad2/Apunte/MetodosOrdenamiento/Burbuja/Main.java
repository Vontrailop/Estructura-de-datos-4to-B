public class Main {
    public static void main(String[] args) {

        int[] numeros = { 5, 9, 8, 1, 6, 2 };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    int aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i : numeros) {
            System.out.println(i);
        }

    }
}