package FunctionalPrograming;

public class demo {
    public static void main(String[] args) {
        //Method:
        // return type -> double
        //name -> getPowerOf
        // parameters list -> (int x, int pow)
        // signature -> getPowerOf(int, int )
        // body -> { return.Math.pow(x, pow) }

        // Read numbers arr from console on one line
        // Read number int pow
        // Rise and print all numbers from  arr[] to pow

        int[] arr = {13, 42, 69, 73};
        int pow = 2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(getPowerOf(arr[i], pow));
        }
    }

    public static double getPowerOf(int x, int pow) {
        return Math.pow(x, pow);
    }
}
