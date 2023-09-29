// Split conocido : De string
// Split array

// merge
/*
* arraycopy (arreglo al que se va a copiar,
* posición del primer arreglo donde se determina la copia,
* arreglo a donde se va a copiar,
* posición del arreglo destino donde se van a agregar los items,
* número de elementos de los arreglos que se van a copiar -del arreglo que se
* va a copiar-
* )
*/

public class Main {
    public static void main(String[] args) {
         String [] letras ="Soy David,, Soy docente, Pertenezco a la utez".split(", ");
         String textoLargo ="Soy David,, Soy docente, Pertenezco a la utez";

         textoLargo.split(textoLargo)
         for (String pal : letras) {
         System.out.println(pal);
         }
        // char [] otrasLetras = "Soy David".toCharArray();
        // for (char c : otrasLetras) {
        // System.out.println(c);
        // }
        // char one = "Soy David".toCharArray()[0];
        // System.out.println(otrasLetras[0]+""+otrasLetras[8]);
        // System.out.println(otrasLetras[1]);
        // System.out.println(otrasLetras[8]);

        // Dividir un arreglo en dos
        int[] arr1 = { 0, 4, 1, 5, 9, 6 };
        int tamanioArreglo = arr1.length;
        int pos = 2;
        int[] arrDividido1 = new int[pos];
        int[] arrDividido2 = new int[tamanioArreglo - pos];

        for (int i = 0; i < pos; i++) {
            arrDividido1[i] = arr1[i];
        }

        for (int i = 0; i < tamanioArreglo - pos; i++) {
            arrDividido2[i] = arr1[i + pos];
        }
        System.out.println("Primer arreglo");
        for (int i : arrDividido1) {
            System.out.print(i+", ");
        }
        System.out.println("Segundo arreglo");
        for (int i : arrDividido2) {
            System.out.print(i+", ");
        }



        for (int i : arrDividido2) {
            
        }
    }
}