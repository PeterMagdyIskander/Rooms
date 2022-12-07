package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<Users,String> {
    public List<Users> findByRoomId(String roomId);
    public Users findByName(String name);
}
