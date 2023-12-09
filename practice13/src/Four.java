import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для добавления в файл (для завершения введите 'exit'):");

        try {
            FileWriter writer = new FileWriter("file.txt", true); // Укажите имя файла, в который вы хотите добавить текст, и true для дописывания

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break; // Если пользователь ввел 'exit', завершаем ввод
                }
                writer.write(input + "\n"); // Записываем строку в файл с переводом строки
            }

            writer.close(); // Закрываем файл после записи
            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при добавлении текста в файл: " + e.getMessage());
        }
    }
}

