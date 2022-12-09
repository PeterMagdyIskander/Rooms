package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<UserDTO> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/users/{name}")
    public UserDTO getUser(@PathVariable String name) {
        return userService.getUser(name);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/rooms/{roomId}/users")
    public void AddUserToRoom(@RequestBody UserDTO user,@PathVariable String roomId) {
        userService.updateUser(user,roomId);
    }


    @RequestMapping("/rooms/{roomId}/users")
    public List<UserDTO> getUserInRoom(@PathVariable String roomId) {
        return userService.getUsersByRoom(roomId);
    }

    
   
    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody UserDTO user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }
}
