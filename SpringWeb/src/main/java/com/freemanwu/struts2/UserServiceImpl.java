package com.freemanwu.struts2;

public class UserServiceImpl implements UserService {

    @Override
    public void register(String name, String password) {
        System.out.println("UserServiceImpl.register");
    }
}
