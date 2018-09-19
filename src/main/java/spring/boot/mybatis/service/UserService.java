package spring.boot.mybatis.service;

import spring.boot.mybatis.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserByName(String name);

}
