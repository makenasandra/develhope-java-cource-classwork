package livecoding.exercises;


import java.io.FileWriter;
import java.io.IOException;


public class TextFileWritingExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write("Opiyo");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
