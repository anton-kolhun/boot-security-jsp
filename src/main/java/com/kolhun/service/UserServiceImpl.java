package com.kolhun.service;

import com.kolhun.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /*@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;*/

    @Override
    public void save(User user) {
        /*user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);*/
    }

    @Override
    public User findByUsername(String username) {
        return new User();
    }
}
