package com.example.ele.controller;

import com.alibaba.druid.util.StringUtils;
import com.example.ele.entity.User;
import com.example.ele.service.UserService;
import com.example.ele.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("save")
    public Result save(@RequestBody User user){
        Result result = new Result();
        try {
            if(StringUtils.isEmpty(user.getId())){
                userService.save(user);
                result.setMsg("保存成功");
            }else{
                userService.update(user);
                result.setMsg("更新用户信息成功");
            }

        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("数据错误");
        }
        return result;
    }

    @DeleteMapping("delete")
    public Result delete(String id){
        Result result = new Result();
        try {
            userService.delete(id);
            result.setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("数据错误");

        }
        return result;

    }

    // 分页查询
    @GetMapping("findByPage")
    public Map<String,Object> findByPage(Integer pageNumber,Integer pageSize){
       Map<String,Object> result = new HashMap<>() ;
        pageNumber = pageNumber==null?1:pageNumber;
        pageSize = pageSize==null?1:pageSize;

       List<User> users = userService.findByPage(pageNumber,pageSize);

       Long totals = userService.findTotals();
       result.put("users",users);
       result.put("total",totals);

       return result;
    }


}
