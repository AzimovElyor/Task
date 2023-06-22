package online.dars.lesson7.task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("axror/axror.txt");
        writing(file);
        reading(file);


    }

    private static void writing(File file) {
        try(FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write("Salom");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void reading(File file) {

        try(FileReader fileReader = new FileReader(file)){
            int i = fileReader.read();
          while (i != -1){
              System.out.print((char)  i);
              i = fileReader.read();
          }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
