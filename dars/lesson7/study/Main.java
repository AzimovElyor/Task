package online.dars.lesson7.study;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("io","elyor.txt");
       // System.out.println(file.createNewFile());
        System.out.println(file.canExecute());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());


    }
    public boolean judgeCircle(String moves) {
       int counterR = 0;
       int counterU = 0;
        for (char c : moves.toCharArray()) {
            if(c == 'R')counterR++;
            if(c == 'L')counterR--;
            if(c == 'U')counterU++;
            if(c == 'D')counterR--;
        }
        return counterR == 0 && counterU == 0;
    }
}
