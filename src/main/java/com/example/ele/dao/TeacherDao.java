package com.example.ele.dao;

import com.example.ele.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TeacherDao {
    void save(Teacher teacher);

    Teacher login(@Param("loginName") String loginName,@Param("password")String password);
}
