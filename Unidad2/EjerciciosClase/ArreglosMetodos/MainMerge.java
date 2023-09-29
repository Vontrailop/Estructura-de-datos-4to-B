public class MainMerge {

    public static void main(String[] args) {

        int[] arr1 = { 4, 5, 2, 4 };
        int[] arr2 = { 4, 5, 9, 8, 8 };

        int[] arraySumma = new int[arr1.length + arr2.length];

        System.arraycopy(
                arr1,
                0,
                arraySumma,
                0,
                arr1.length);

        System.arraycopy(
                arr2,
                0,
                arraySumma,
                arr1.length,
                arr2.length);

        for (int i : arraySumma) {
            System.out.print(i + ", ");
        }
    }

}

