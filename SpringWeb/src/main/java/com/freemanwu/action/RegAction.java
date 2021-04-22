package com.freemanwu.action;

import com.freemanwu.entity.User;
import com.freemanwu.service.UserService;
import com.opensymphony.xwork2.Action;

public class RegAction implements Action {
    private UserService userService;
    private User user;

    //input type = "text" name="user.name"
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() {
        userService.register(user);
        return Action.SUCCESS;
    }
}
