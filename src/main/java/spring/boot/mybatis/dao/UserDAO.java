package spring.boot.mybatis.dao;

import spring.boot.mybatis.pojo.User;

import java.util.List;

public interface UserDAO {

    List<User> findAllUser();

    User findUserByName(String name);

}
