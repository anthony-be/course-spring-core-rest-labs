package be.cocoding.training.spring.rest;

import java.util.List;

public class UserController {

    private UserService userService;

    public List<User> findUsers(){
        return userService.findUsers(null, null);
    }

    public User getUser123(){
        return userService.getUser(123);
    }

    public void deleteUser123(){
        userService.deleteUser(123);
    }
}
