/*
public class Main {
    public static void main(String[] args) {
        int number = 12345;
        printDigits(number);
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        } else {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            printDigits(n / 10);
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        int n = 13  ;
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            printNumbersA(A, B);
        } else {
            printNumbersB(A, B);
        }
    }

    public static void printNumbersA(int current, int target) {
        if (current <= target) {
            System.out.println(current);
            printNumbersA(current + 1, target);
        }
    }

    public static void printNumbersB(int current, int target) {
        if (current >= target) {
            System.out.println(current);
            printNumbersB(current - 1, target);
        }
    }
}
