import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("mathFile.txt");
            BufferedWriter bfw = new BufferedWriter(fileWriter);
            bfw.write("1 + 2");
            bfw.newLine();
            bfw.write("2 + 2");
            bfw.newLine();
            bfw.write("3 - 2");
            bfw.newLine();
            bfw.write("2 * 4");
            bfw.close();

        } catch (FileNotFoundException e) {
            System.err.println("Cann not find the file");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
