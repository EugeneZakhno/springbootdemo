package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {  // binding make via constructor
        this.userRepository = userRepository;
    }

    public User findById(Long id){             // read
    return userRepository.getOne(id);
    }

    public List<User> findAll(){               // read
        return userRepository.findAll();
    }
    public User saveUser(User user){           // update
        return userRepository.save(user);
    }

    public  void deleteById(Long id){        // delete
        userRepository.deleteById(id);

    }

}
