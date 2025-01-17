
package solution;

import java.util.ArrayList;
import java.util.Scanner;

public class spiral {
    int x_limit;
    int y_limit;

    public spiral(int x, int y) {
        x_limit = x;
        y_limit = y;
    }

    public ArrayList<Integer> solution(int x, int y, int distance, int pre, int count,ArrayList<Integer> cells) {

        if (count != x_limit * y_limit) {
            int j = -distance - 1;
            int i = 1;
            int move = 0;

            if (distance <= 0) {
                if (distance == 0) {
                    if (pre < 0)
                        distance = 1;
                    else
                        distance = -1;
                } else {
                    i = -1;
                    j = 0 - distance + 1;
                }
            }

            while (true) {

                move += i;
                x += i;
                if (!(y > y_limit || y <= 0 || x > x_limit || x <= 0)) {

                    // System.out.println((x - 1) * y_limit + y);
                    cells.add((x - 1) * y_limit + y);
                    count++;
                }
                if (move == distance) {
                    break;
                }
            }
            move = 0;
            while (true) {
                move += i;
                y += i;

                if (!(y > y_limit || y <= 0 || x > x_limit || x <= 0)) {
                    // System.out.println((x - 1) * y_limit + y);
                    cells.add((x - 1) * y_limit + y);
                    count++;
                }

                if (move == distance)
                    break;

            }
            solution(x, y, j, i, count,cells);

        }
        return cells;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the x coordinate for grid: ");
        int x = scanner.nextInt();

        System.out.println("Enter the y coordinate for grid: ");
        int y = scanner.nextInt();

        System.out.println("Enter the x coordinate for starting position: ");
        int x_1 = scanner.nextInt();

        System.out.println("Enter the y coordinate for starting position: ");
        int y_1 = scanner.nextInt();
        scanner.close();
        // System.out.println((x_1 - 1) * x + y_1);
        spiral s = new spiral(x, y);
        ArrayList<Integer> cell = new ArrayList<Integer>();
        cell.add((x_1 - 1) * x + y_1);
        s.solution(x_1, y_1, -1, -1, 1,cell);
        System.out.println(cell);

    }
}
