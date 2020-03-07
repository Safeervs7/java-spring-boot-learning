package com.learning.springdemo.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private static List<User> users = new ArrayList();
    private static int counter = 0;

    static {
        users.add(new User("Test1", 12, ++counter));
        users.add(new User("Test2", 12, ++counter));
        users.add(new User("Test3", 12, ++counter));
    }

    public List findAll(){
        return users;
    }

    public void addUser(User user){
        users.add(user);
        return;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        throw new UserNotFound("User is Not Found");
    }

}
