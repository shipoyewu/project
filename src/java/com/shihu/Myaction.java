package com.shihu;

import com.shihu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by BenBen on 2017/6/13.
 */
public class Myaction {
    @Autowired
    User user;
    @Autowired
    UserDao userDao;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String execute() throws Exception{
        System.out.println(user);
        userDao.save(user);
        System.out.println("hello world!");
        return "index";
    }
}
