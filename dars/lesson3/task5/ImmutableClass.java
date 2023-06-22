package online.dars.lesson3.task5;

import java.util.HashMap;
import java.util.HashSet;

public class ImmutableClass {
    public static void main(String[] args) {
        Person person = new Person("Ali", 18, new Car("ZZZ777", "Jiguli 07"));

    }
    public int uniqueMorseRepresentations(String[] words) {
    String [] str = {".-","-...","-.-.","-..",".","..-.","--.","....", "..",".---","-.-",".-..","--","-.","---",".--.","- -.-",".-.","...","-","..-","...-",".--","-..-","-. --","--.."};
        HashSet<String> strings = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++) {
                stringBuilder.append(str[words[i].charAt(i) - 'a']);
            }
            strings.add(stringBuilder.toString());
        }
        return strings.size();
    }
}

