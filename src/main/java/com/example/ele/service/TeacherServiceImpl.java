package com.example.ele.service;

import com.example.ele.dao.TeacherDao;
import com.example.ele.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService{
    @Resource
    private TeacherDao teacherDao;

    @Override
    public void register(Teacher teacher) {
        teacher.setId(UUID.randomUUID().toString());
        teacherDao.save(teacher);
    }

    @Override
    public Teacher login(String loginName, String password) {
        return teacherDao.login(loginName,password);
    }
}
