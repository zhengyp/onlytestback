package com.example.ele.controller;

import com.example.ele.entity.Teacher;
import com.example.ele.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
@CrossOrigin
@Controller
@RequestMapping("/user")
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @PostMapping("/register")
    public String register(Teacher teacher){
        teacherService.register(teacher);
        return "redirect:/index";
    }


    @PostMapping("/login")
    public String login(String loginName,String password){
        Teacher login = teacherService.login(loginName,password);
        if(login!=null){
            return "redirect:/index";
        }else{
            return "redirect:/toregister";
        }
    }

}
