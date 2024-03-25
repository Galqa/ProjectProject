package com.project.newweb.services;


import com.project.newweb.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);
}
