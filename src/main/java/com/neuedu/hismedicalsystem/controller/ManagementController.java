package com.neuedu.hismedicalsystem.controller;

import com.neuedu.hismedicalsystem.model.po.Dept;
import com.neuedu.hismedicalsystem.model.po.User;
import com.neuedu.hismedicalsystem.model.service.DeptService;
import com.neuedu.hismedicalsystem.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/management")
public class ManagementController {
    
    @Autowired
    private UserService userService;

    @Autowired
    private DeptService deptService;

    @RequestMapping("/users")
    public List<User> getUsers(@RequestBody User condition){
        return userService.getUsers(condition);
    }

    @RequestMapping("/depts")
    public List<Dept> getDepts(@RequestBody Dept condition){
        return deptService.getDepts(condition);
    }
}
