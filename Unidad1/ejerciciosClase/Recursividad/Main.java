
public class Main {
    public static void main(String[] args) {
           // ejercicios
            // factorial de un 
        try {
            pruebaError();
        } catch (StackOverflowError e) {
            System.out.println("Error de infinito");
            // TODO: handle exception
        }
        //System.out.println(factorial(5));
    }
    // iteracion 1
    // num = 5:
    // factoria (5-1)

    // iteracion 2
    // num = 4:
    // factoria (4-1)

        // iteracion 3
    // num = 3:
    // factoria (3-1)

        // iteracion 4
    // num = 2:
    // factoria (2-1)

            // iteracion 5
    // num = 1:
    // factoria (1-1)

            // iteracion 6
    // num = 0:
    // return num = 1
    public static int factorial(int num){
        if(num>0) return num * factorial(num-1);
        return 1;
    }

    public static void pruebaError(){
        System.out.println("Probando  error");
        pruebaError();
    }
    

}