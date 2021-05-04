package com.example.ele.service;

import com.example.ele.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    void delete(String id);


    void update(User user);

    // 分页查询
    List<User> findByPage(Integer pageNow, Integer rows);

    //查询总条数
    Long findTotals();
}
