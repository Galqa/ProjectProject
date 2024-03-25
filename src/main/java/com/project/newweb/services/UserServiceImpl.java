package com.project.newweb.services;



import com.project.newweb.model.User;
import com.project.newweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        if (user.getRole()==null) {
            user.setRole("user");
        }

        userRepository.save(user);
    }
}
