package online.dars.lesson7.task4;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        User user = new User("Axror", 20, "+9989999999");
        File file = new File("axror/axror.txt");
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(in);
        User user1 = (User) inputStream.readObject();
        System.out.println(user1);

    }

    private static void write() throws IOException {
        User user = new User("Axror", 20, "+9989999999");
        File file = new File("axror/axror.txt");
        FileOutputStream out = new FileOutputStream(file,true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(user);
    }
}
class User implements Serializable {
    private String name;
    private int age;
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
