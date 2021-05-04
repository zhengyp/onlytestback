package com.example.ele;

import com.example.ele.entity.User;
import com.example.ele.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;
    @Test
    public void testFindAll(){
        userService.findAll().forEach(user -> System.out.println("user="+user));
    }
    @Test
    public void testSave(){
        User user = new User();
        user.setName("zhangqingmei");
        user.setSex("女");
        user.setBir(new Date());
        user.setAddress("上海市浦东新区");
        userService.save(user);
    }
    @Test
    public void  testDelete(){
        userService.delete("8");
    }
}
