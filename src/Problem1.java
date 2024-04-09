import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findMin(array, n));
    }

    static int findMin(int[] array, int n) {
        if (n == 1)
            return array[0];
        else
            return Math.min(array[n - 1], findMin(array, n - 1));
    }
}
