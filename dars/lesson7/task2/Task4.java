package online.dars.lesson7.task2;



import java.io.*;

import java.util.*;

import static java.util.Arrays.*;

public class Task4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      //  System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12},9));
        // System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 2, 3}));
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        write();

        File file = new File("axror/axror5.txt");
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(in);
        User user1 = (User) inputStream.readObject();
        System.out.println(user1);
    }
    private static void write() throws IOException {
        User user = new User("Axror", 20, "+9989999999");
        File file = new File("axror/axror5.txt");
        FileOutputStream out = new FileOutputStream(file,true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(user);
    }

    public static String sortSentence(String s) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++){
            int num = Integer.parseInt(String.valueOf(array[i].charAt(array[i].length()-1)));
            map.put(num,array[i].substring(0, array[i].length()-1));
        }
        StringBuilder resualt = new StringBuilder();
        for(int i = 1; i <=array.length; i++ ){
            resualt.append(map.get(i));
            resualt .append(" ");
        }
        return resualt.substring(0, resualt.length()-1);
    }
}
class User implements Serializable {
    private String name;
    private transient int age;
    private String phoneNumber;

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

