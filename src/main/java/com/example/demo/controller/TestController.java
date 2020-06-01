package com.example.demo.controller;

import cn.shuibo.annotation.Decrypt;
import cn.shuibo.annotation.Encrypt;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Aeiherumuh
 * @date 2020/6/1
 */
@Controller
public class TestController {
    /**
     * 加密
     *
     * @return
     */
    @RequestMapping("/encryption")
    @ResponseBody
    @Encrypt
    public User encryption() {
        User user = new User("test", "123", 1);
        return user;
    }

    /**
     * 解密
     * @param user
     * @return
     */
    @PostMapping("/decryption")
    @Decrypt
    @ResponseBody
    public String Decryption(@RequestBody User user) {
        System.out.println(user.toString());
        return user.toString();
    }
}
