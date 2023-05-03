package concept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String content = "This is an example of BufferedWriter.";
            bw.write(content);
            bw.newLine(); // 줄 바꿈
            bw.write("Another line of text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}