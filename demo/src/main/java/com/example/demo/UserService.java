package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<Users> getUsers() {
        return (List<Users>) userRepository.findAll();
    }

    public List<Users> getUsersByRoom(String roomId) {
        return (List<Users>) userRepository.findByRoomId(roomId);
    }

    public Users getUser(String id) {
        return userRepository.findById(id).get();
    }

    public void addUser(Users user) {
        userRepository.save(user);
    }

    public void updateUser(Users user){
        userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
  
}
