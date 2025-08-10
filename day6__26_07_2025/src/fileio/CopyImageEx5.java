package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageEx5 {
	public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("\"D:\\Java_programming_language_logo.svg.png\"");
             FileOutputStream fos = new FileOutputStream("\"D:\\Java_programming_language_logo.svg.png\"")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
