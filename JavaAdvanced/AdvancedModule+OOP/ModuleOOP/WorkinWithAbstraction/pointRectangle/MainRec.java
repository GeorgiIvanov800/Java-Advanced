package ModuleOOP.WorkinWithAbstraction.pointRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class MainRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinate = getCoordinate(scanner);

        Point A = new Point(coordinate[0], coordinate[1]);
        Point C = new Point(coordinate[2], coordinate[3]);

        Rectangle rect = new Rectangle(A, C);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] pointCoordinates = getCoordinate(scanner);

            Point x = new Point(pointCoordinates[0], pointCoordinates[1]);
            //Pa(x1, y1), Pb(x2, y2), Px(x3, y3)
            // For Px to be inside the following should be true
            // x3 >= x1 && y3 >= y1 && x3 <= x2 && y3 <= y2


            boolean isInside = rect.contains(x);
            System.out.println(isInside);
        }

    }

    private static int[] getCoordinate(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
