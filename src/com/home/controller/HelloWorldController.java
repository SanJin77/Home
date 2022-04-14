package com.home.controller;

import com.home.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("hello=========");
        model.addAttribute("msg","你好");
        return "hello";
    }

    @RequestMapping("/useRequestParam")
    public String useRequestParam(@RequestParam("name")String username, @RequestParam(value = "age",required = false)Integer age) {
        System.out.println(username+","+age);
        return "success";
    }

    @RequestMapping("/useRequestBody")
    public String useRequestBody(@RequestBody(required = false) String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testResponseJson")
    public String testResponseJson(@RequestBody User user) {
        System.out.println("异步请求："+user);
        return "";
    }

    @RequestMapping("/usePathVariable/{id}")
    public String usePathVariable(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testReturnString")
    public String testReturnString() {
        System.out.println("AccountController 的 testReturnString 方法执行了");
        return "success";
    }

    @RequestMapping("/testReturnModelAndView")
    public ModelAndView testReturnModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username","张三");
        return mv;
    }
}
