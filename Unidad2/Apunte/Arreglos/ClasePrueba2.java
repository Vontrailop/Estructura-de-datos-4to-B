public class ClasePrueba2{

    public static void main(String[] args) {
        
        int [][] arregloBi = new int[2][2];
        int [][] arregloBi2 = {{1,2},{3,4}};

        for (int i = 0; i < arregloBi.length; i++) {
            for (int j = 0; j < arregloBi[i].length; j++) {
                System.out.print(" "+arregloBi[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arregloBi2.length; i++) {
            for (int j = 0; j < arregloBi2[i].length; j++) {
                System.out.print(" "+arregloBi2[i][j]);
            }
            System.out.println();
        }
    }
}