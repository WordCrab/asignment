import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        double sum = findSum(array, n);
        double average = sum / n;
        System.out.println(average);
    }

    static double findSum(int[] array, int n) {
        if (n <= 0)
            return 0;
        else
            return (findSum(array, n - 1) + array[n - 1]);
    }
}
