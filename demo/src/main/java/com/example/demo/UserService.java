package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getUsers() {
        List<UserDTO> users=new ArrayList<>();
        for(Users u:userRepository.findAll()){
            users.add(modelMapper.map(u, UserDTO.class));
        };
        return users;
    }

    public List<UserDTO> getUsersByRoom(String roomId) {
        List<UserDTO> users=new ArrayList<>();
        for(Users u:userRepository.findByRoomId(roomId)){
            users.add(modelMapper.map(u, UserDTO.class));
        };
        return users;
    }

    public UserDTO getUser(String id) {
        return modelMapper.map(userRepository.findById(id).get(),UserDTO.class) ;
    }

    public void addUser(UserDTO user) {
        Users userEntity=new Users(user.getName());
        userRepository.save(userEntity);
    }

    public void updateUser(UserDTO user,String roomId){
        Users userEntity=userRepository.findByName(user.getName());
        userEntity.setRoom(new Room(roomId));
        userRepository.save(userEntity);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
  
}
