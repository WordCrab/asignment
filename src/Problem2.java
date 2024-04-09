import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = sum / n;
        System.out.println(average);
    }
}