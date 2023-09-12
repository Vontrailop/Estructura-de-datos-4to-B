package Unidad1.Apunte.Recursividad;

import java.util.Scanner;

public class MainPruebas {

    // Condiciones
    // 1 La recursividad se basa en el autollamado de la misma función +
    // 2 Hay que evitar caer en ciclo infinito mediante una condición de salida -
    // 3 Se recomienda hacer uso de try/catch stackoverflow err + 

    // ejercicios
    // factorial de N número


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un numero entero");
        int numLeido  = leer.nextInt();
        try {
            //recursivoError();
            System.out.println(fibonacciRecursivo(numLeido));
        } catch (StackOverflowError e) {
            System.out.println("salvado del infinito");
        }

    }

    public static void recursivoError() {
        System.out.println("Problema");
        recursivoError();
    }


    // num = 5: if(num>0) num*(num-1) 
    // num = 3;
    public static int factoriales(int num){
        if(num>1) return factoriales(num-1)*num;
        return 1;
    }
    
    public static int fibonacciRecursivo(int n) {
 
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
    }
}


// programas ejercicios estudiantes
// suma de numeros naturales con el tope de x numero dado
// resta de numeros naturales con el tope de x numero dado
