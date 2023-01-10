package FirstModule.MultidimensionalArrays;

public class demo {
    public static void main(String[] args) {

        //int[] arr = new int[3];
        int[] arr2 = new int[3];
        // code to insert elements


        int[][] matrix2 = {
                {13, 42, 69},
                {24, 56, 87},
                {54, 78, 55}
        };

        // 1 -> prev + 1 .....
        int[][] matrix = new int[3][4];
        int start = 1;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                 matrix[row][col] = start;
                 start++;
            }
        }
        System.out.println();
    }
}
