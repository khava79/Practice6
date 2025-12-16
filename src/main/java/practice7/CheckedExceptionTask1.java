package practice7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionTask1 {
    public void openFile() {
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("Файл успешно открыт!");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

    }

}
