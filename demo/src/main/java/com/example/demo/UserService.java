package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // @Autowired
    // private UserRepository userRepository;

    private List<User> users=new ArrayList<User>(){
        {
            add(new User("PeterISK", "1", Arrays.asList("SEC"), Arrays.asList("SEC"),
            Arrays.asList("123")));
        }
    };


    public List<User> getAllUsers() {
        return users;
        // List<User> users=new ArrayList<>();
        //  userRepository.findAll().forEach(users::add);
        // return users;
    }


    public User getUser(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    public void addUser(User user) {
        users.add(user);
        // userRepository.save(user);
    }

    //TODO : DELETE User
}
