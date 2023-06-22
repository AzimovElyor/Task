package online.dars.lesson7.task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       write();
        File file = new File("axror/axror.txt");
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(in);
        System.out.println(inputStream.readObject());


    }

    private static void write() throws IOException {
        User1 user = new User1("Axror", 20, "+9989999000");
        File file = new File("axror/axror.txt");
        FileOutputStream out = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(user);
    }
}
class User1 implements Externalizable {
    private String name;
    private int age;
    private String phoneNumber;
    public User1() {
    }

    public User1(String name, int age, String phoneNumber) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeInt(age);
        out.writeObject(this.phoneNumber);
    }



    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
  this.name = (String) in.readObject();
  this.phoneNumber = (String) in.readObject();
    }
}
