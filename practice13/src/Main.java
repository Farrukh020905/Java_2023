import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для записи в файл (для завершения введите 'exit'):");

        try {
            FileWriter writer = new FileWriter("output.txt"); // Укажите имя файла, в который вы хотите записать данные

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break; // Если пользователь ввел 'exit', завершаем ввод
                }
                writer.write(input + "\n"); // Записываем строку в файл с переводом строки
            }

            writer.close(); // Закрываем файл после записи
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
