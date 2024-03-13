package org.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDAO {

    private Map<String, User> userMap = new HashMap<>();

    public void saveUser(User user){
        userMap.put(user.getUserId(), user);

    }

    public User findUser(String userId){
        return userMap.get(userId);
    }
}
