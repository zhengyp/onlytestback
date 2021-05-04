package com.example.ele.dao;

import com.example.ele.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface  UserDao {
    List<User> findAll();

    void save(User user);

    void delete(String id);

    void update(User user);

    // 分页查询
    List<User> findByPage(@Param("start")Integer start,@Param("rows")Integer rows);

    //查询总条数
    Long findTotals();

}
