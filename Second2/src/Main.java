//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        int sumFor = calculateSumUsingFor(numbers);
//        System.out.println("Сумма чисел, вычисленная с помощью цикла for: " + sumFor);
//
//        int sumWhile = calculateSumUsingWhile(numbers);
//        System.out.println("Сумма чисел, вычисленная с помощью цикла while: " + sumWhile);
//
//        int sumDoWhile = calculateSumUsingDoWhile(numbers);
//        System.out.println("Сумма чисел, вычисленная с помощью цикла do-while: " + sumDoWhile);
//    }
//
//    private static int calculateSumUsingFor(int[] numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        return sum;
//    }
//
//    private static int calculateSumUsingWhile(int[] numbers) {
//        int sum = 0;
//        int i = 0;
//        while (i < numbers.length) {
//            sum += numbers[i];
//            i++;
//        }
//        return sum;
//    }
//
//    private static int calculateSumUsingDoWhile(int[] numbers) {
//        int sum = 0;
//        int i = 0;
//        do {
//            sum += numbers[i];
//            i++;
//        } while (i < numbers.length);
//        return sum;
//    }
//}


//Второе задание
//public class Main {
//    public static void main(String[] args) {
//        args = new String[]{"value1", "value2", "value3"};
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Аргумент " + i + ": " + args[i]);
//        }
//    }
//}




//Третье задание

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Первые 10 чисел гармонического ряда:");
//
//        for (int i = 1; i <= 10; i++) {
//            double harmonicNumber = calculateHarmonicNumber(i);
//            System.out.println(harmonicNumber);
//        }
//    }
//
//    public static double calculateHarmonicNumber(int n) {
//        double harmonicNumber = 0.0;
//
//        for (int i = 1; i <= n; i++) {
//            harmonicNumber += 1.0 / i;
//        }
//
//        return harmonicNumber;
//    }
//}


//Четвёртое задание
//import java.util.Arrays;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = generateRandomArray(10); // Генерируем массив из 10 случайных чисел
//        System.out.println("Исходный массив: ");
//        printArray(array); // Выводим исходный массив
//
//        Arrays.sort(array); // Сортируем массив
//
//        System.out.println("Отсортированный массив: ");
//        printArray(array); // Выводим отсортированный массив
//    }
//
//    public static int[] generateRandomArray(int length) {
//        int[] array = new int[length];
//        Random random = new Random();
//
//        for (int i = 0; i < length; i++) {
//            array[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
//        }
//
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//}


//Пятое задние

//public class Main {
//    public static void main(String[] args) {
//        int number = 5; // Число, для которого будем вычислять факториал
//        long factorial = calculateFactorial(number);
//        System.out.println("Факториал числа " + number + " равен: " + factorial);
//    }
//
//    public static long calculateFactorial(int number) {
//        long factorial = 1;
//
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//
//        return factorial;
//    }
//}
