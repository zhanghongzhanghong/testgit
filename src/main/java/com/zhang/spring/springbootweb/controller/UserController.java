package com.zhang.spring.springbootweb.controller;

import com.zhang.spring.springbootweb.service.UserService;
import com.zhang.spring.springbootweb.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.*;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 返回用户信息接口
     * @return
     */
    @RequestMapping("/getUserInfo.do")
    @ResponseBody
    public List<Map<String,Object>> getUserInfo(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> user = new HashMap<>();
        user.put("name","zhang");
        user.put("age",11);
        list.add(user);
        return  list;
    }


    /**
     * 转发到jsp
     */
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<>();
        User user = new User("1","zhang",12);
        list.add(user);
        user = new User("2","tian",13);
        list.add(user);

        model.addAttribute("list",list);
        return  "userlist";
    }

    /**
     * 转发到ftl
     */
    @RequestMapping("/getUserinfo")
    public String getUserinfo(Model model){
        List<User> list = new ArrayList<>();
        User user = new User("1","zhang",12);
        list.add(user);
        user = new User("2","tian",13);
        list.add(user);

        model.addAttribute("list",list);
        return  "userinfo";
    }



    /**
     * thymeleaf  调用前端页面
     * @param model
     * @return
     */
    @RequestMapping("/thymeleaf.do")
    public String  getThymeleaf(Model model, HttpServletRequest req){
           model.addAttribute("content","阳光");

           model.addAttribute("date", Calendar.getInstance().getTime());

           model.addAttribute("judge",1);

           List<User> list = new ArrayList<>();
           User user = new User("1","zhang",2);
           list.add(user);
           user = new User("2","hong",3);
           list.add(user);
           model.addAttribute("list",list);

           Map<String,User> map = new HashMap<>();
           user = new User("3","zhang3",2);
           map.put("m1",user);
           user = new User("4","zhang4",4);
           map.put("m2",user);
           model.addAttribute("map",map);

           req.setAttribute("req","request");
           req.getSession().setAttribute("session","session");
           req.getSession().getServletContext().setAttribute("ServletContext","ServletContext");


           return "thymeleaf";

    }

    /**
     * restful 风格的网页访问
     */
    @RequestMapping("path/{page}")
    public String topage(@PathVariable String page){


        return page;
    }

    /**
     * 添加用户
     */
    @ResponseBody
    @RequestMapping("insertUser")
    public String insertUser(){

        User user = new User();
        user.setName("22");
        user.setAge(77);
        return userService.insertUser(user) + "";
    }

    @RequestMapping("addUser")
    public String addUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add";
        }
        return "ok";
    }

     @RequestMapping("addPage")
     public  String addPage(User user){
        return "add";
     }
}
