import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("String.txt");

        String str = scanner.nextLine();
        scanner.close();

        FileWriter fw = new FileWriter(file);
        fw.write(str+"\n");
        fw.flush();

        FileReader fr = new FileReader(file);
        char [] array =  new char[50];
        int size = fr.read(array);
        fr.close();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if(array[i]=='a')
                count++;
        }

        fw.write(String.valueOf(count));
        fw.close();
    }
}
