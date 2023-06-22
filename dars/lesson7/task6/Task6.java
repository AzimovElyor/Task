package online.dars.lesson7.task6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException {
        File file = new File("axror", "axror3.txt");
        System.out.println(file.canRead());
        if(!file.exists()){
           file.createNewFile();
            System.out.println("new file created");
        }else{
            try (FileWriter fileWriter = new FileWriter(file,true)){
                fileWriter.write("Salom");
            }catch (IOException e){
                e.printStackTrace();
            }
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i != -1){
                System.out.print((char)  i);
                i = fileReader.read();
            }
        }


    }
}
