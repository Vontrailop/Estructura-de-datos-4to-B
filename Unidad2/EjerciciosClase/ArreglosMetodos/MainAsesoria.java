
/*encapsulamiento
* publico=public, privado=private, protegido=protected

publico: Todo mundo tiene acceso
privado: Solo para la clase
protegido: las clases que lo heredan
*/
import java.util.Scanner;

public class MainAsesoria {
    public static void main(String args[]) {

        // System.out.println("Hola mundo");
        Scanner lector = new Scanner(System.in);
        // pedir números
        int num1, num2;
        int num3 = 0;
        // num1 = 2;
        // num2 = 3;
        int opc1 = 0;
        while (opc1 != 2) {
            System.out.println("Escriba el primer número");
            num1 = lector.nextInt();
            System.out.println("Escriba el segundo número");
            num2 = lector.nextInt();
            System.out.println("El promedio  es:");
            System.out.println((num1 + num2) / 2);
            System.out.println("¿Nuevo número (1) o salir (2)? ");
            opc1 = lector.nextInt();
        }
        System.out.println("Fin del programa");

    }
}
