package com.example.demo.services;
import java.util.ArrayList;
import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> allUsers(){
       return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser( UserModel user ){
        return userRepository.save(user);
    }

}
