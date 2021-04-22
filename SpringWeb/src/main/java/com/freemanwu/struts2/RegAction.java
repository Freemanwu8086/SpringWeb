package com.freemanwu.struts2;

import com.opensymphony.xwork2.Action;

public class RegAction implements Action {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {

        userService.register("wsq","21345");
        return Action.SUCCESS;
    }
}
