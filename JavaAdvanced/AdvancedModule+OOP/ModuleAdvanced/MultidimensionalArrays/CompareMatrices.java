package ModuleAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = Utils.readMatrix(scanner);
        int[][] secondMatrix = Utils.readMatrix(scanner);
        boolean areEqual = compareMatrices(firstMatrix,secondMatrix);

//        if (Arrays.deepEquals(firstMatrix, secondMatrix)) {
//            System.out.println("equal");
//        }

        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    public static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if (firstArr.length != secondArr.length) {
                return false;
            }

            for (int col = 0; col < firstArr.length; col++) {
                int firstElement = firstArr[col];
                int secondElement = secondArr[col];

                if (firstElement != secondElement) {
                    return false;
                }
            }

        }
        return true;
    }

}
