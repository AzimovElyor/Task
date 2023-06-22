package online.dars.lesson3.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class UserRepository {
    private static UserRepository userRepository = new UserRepository();

    private List<User> users = Collections.synchronizedList(new ArrayList<>());
   // private List<User> users = new ArrayList<>();
    private UserRepository(){

    }

    public boolean add(User user){
        /*for (User user1 : users) {
            if(user1.getAge() == user.getAge()) return false;
        }*/
        users.add(user);
        return true;
    }
    public User getUserById(UUID id){
        for (User user : users) {
            if(user.getId().equals(id)) return user;
        }
        return null;
    }
    public List<User> getAll(){
        return users;
    }
    public void delete(UUID id){
        users.removeIf(user -> user.getId().equals(id));
    }

    public static UserRepository getInstance() {
        return userRepository;
    }
}
