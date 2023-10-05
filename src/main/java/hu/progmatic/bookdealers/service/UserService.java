package hu.progmatic.bookdealers.service;

import hu.progmatic.bookdealers.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    private final Random randomGenerator;
    List<User> users = new ArrayList<>();

    public UserService(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
        users.add(new User("Gábor","gabor@gmail.com", 1));
        users.add(new User("Béla","bela@gmail.com", 2));
    }


    public List<User> getAllUsers() {
        return users;
    }


    public void addUser(User user) {
        users.add(user);


    }

    public User getRandomUser() {
        return users.get(randomGenerator.nextInt(users.size()));
    }

    public String findUser(int givenId) {
        for (User user : users) {
            if (givenId == user.id) {
                return user.getUserName();

            }


        }

return "nincs ilyen user";
    }
}
