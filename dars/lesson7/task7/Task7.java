package online.dars.lesson7.task7;

import java.io.*;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
    File file = new File("axror", "axror2.txt");
        File newFile = new File("axror", "axrorbek.txt");
        try(InputStream inputStream = new FileInputStream(file)) {
            OutputStream outputStream = new FileOutputStream(newFile,true);
            if(!newFile.exists()){
                newFile.createNewFile();
                inputStream.transferTo(outputStream);
            }
            else inputStream.transferTo(outputStream);

            outputStream.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
