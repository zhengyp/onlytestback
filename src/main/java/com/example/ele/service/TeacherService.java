package com.example.ele.service;

import com.example.ele.entity.Teacher;

public interface TeacherService {
    void register(Teacher teacher);
    Teacher login(String loginName,String password);
}
