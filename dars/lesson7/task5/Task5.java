package online.dars.lesson7.task5;

import java.io.*;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("axror/axror2.txt");
        bufferWriter(file);
        bufferReader(file);
    }

    private static void bufferWriter(File file) {
        try (FileWriter fileWriter = new FileWriter(file,true)){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             bufferedWriter.write("Salom\n");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void bufferReader(File file) {
        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().forEach(System.out::println);
        }
            catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
