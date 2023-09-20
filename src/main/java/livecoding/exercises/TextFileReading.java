package livecoding.exercises;


import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReading {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println(bufferedReader.readLine());
            bufferedReader.close();

            ///ALTERNATIVE

            Scanner scanner = new Scanner(new File("output.txt"));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
