package com.dy.dyapiinterface.cotroller;


import com.dy.dyapiclientsdk.model.User;
import com.dy.dyapiinterface.utils.RandomNameGenerator;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
public class NameController {
    @PostMapping()
    public String getNameByGet() {
        return RandomNameGenerator.generateName();
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getNameByPost(@RequestBody User user, HttpServletRequest request) {
        return "POST 你的名字是" + user.getUsername();
    }

}
