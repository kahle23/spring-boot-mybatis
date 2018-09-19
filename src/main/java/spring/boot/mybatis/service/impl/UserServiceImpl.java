package spring.boot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.mybatis.dao.UserDAO;
import spring.boot.mybatis.pojo.User;
import spring.boot.mybatis.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findAllUser() {
        List<User> users = userDAO.findAllUser();
        return users;
    }

    @Override
    public User findUserByName(String name) {
        User user = userDAO.findUserByName(name);
        return user;
    }

}
