package com.dubbo.dubboconsumer.controller;

import com.dubbo.dubboapi.entity.User;
import com.dubbo.dubboconsumer.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    @Autowired
    IndexService indexService;

    @RequestMapping("hello")
    public ModelAndView hello(String id){
        User user = indexService.getUser(id);
        if(user != null){
            ModelAndView mv = new ModelAndView("index");
            mv.addObject("id", id);
            mv.addObject("name", user.getName());
            mv.addObject("age", user.getAge());
            mv.addObject("phone", user.getPhone());
            mv.addObject("email", user.getEmail());
            return mv;
        }else {
            ModelAndView mv = new ModelAndView("error");
            return mv;
        }
    }
}
