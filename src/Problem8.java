import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        } else if (!Character.isDigit(s.charAt(index))) {
            return false;
        } else {
            return isAllDigits(s, index + 1);
        }
    }
}
