package com.ds.flyway;

import java.util.List;

@org.springframework.stereotype.Service
public class UserService implements Service<User, UserDTO>{

    @Override
    public User save(UserDTO userDTO) {
        return null;
    }

    @Override
    public User update(UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(UserDTO userDTO) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
