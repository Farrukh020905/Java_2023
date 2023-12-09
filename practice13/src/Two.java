import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Two {
    public static void main(String[] args) {
        String fileName = "output.txt"; // Укажите имя файла, который вы хотите прочитать

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Выводим каждую строку из файла на экран
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
