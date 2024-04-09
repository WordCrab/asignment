import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomial(n, k));
    }

    static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomial(n - 1, k - 1) + binomial(n - 1, k);
        }
    }
}