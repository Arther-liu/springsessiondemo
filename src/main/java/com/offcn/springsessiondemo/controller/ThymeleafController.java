package com.offcn.springsessiondemo.controller;

import com.offcn.springsessiondemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class ThymeleafController {
    @GetMapping("/indexPage")
    public String indexPage(Model model){
        String message = "hello Thymeleaf";
        model.addAttribute("message",message);
        //设置对象
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setName("zhuzhu");
        model.addAttribute("user",user);
        //设置一个map
        Map map = new HashMap();
        map.put("src1","brand_05.PNG");
        map.put("src2","brand_07.PNG");
        map.put("src3","brand_09.PNG");
        model.addAttribute("src",map);
        //设置多个user进行遍历
        List<User> list = new ArrayList<>();
        User u1 = new User();
        u1.setId(1);
        u1.setAge(19);
        u1.setName("Lily");
        User u2 = new User();
        u2.setId(2);
        u2.setAge(23);
        u2.setName("Catelina");
        User u3 = new User();
        u3.setId(3);
        u3.setAge(21);
        u3.setName("Garron");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        model.addAttribute("list",list);
        //拼接model中的字符串
        model.addAttribute("userName","猪猪");
        model.addAttribute("href","http://dongyinmai.com");
        //Thymeleaf进行条件判断
        model.addAttribute("flag","yes");
        model.addAttribute("menu","Lucy");
        model.addAttribute("manager","Lucy");
        //定义日期、字符串、数字
        Date date = new Date();
        model.addAttribute("date",date);
        double price = 128.123;
        model.addAttribute("price",price);
        String str = "婆婆撇开电动机舒克舒克小米小米舒克舒克" +
                "撒飒飒大罚单时气温气温阿萨德给对方v" +
                "各方长长的年度考试科目成绩广告费";
        model.addAttribute("str",str);
        String text = "JAVA-offcn";
        model.addAttribute("text",text);

        return "index";
    }
}
