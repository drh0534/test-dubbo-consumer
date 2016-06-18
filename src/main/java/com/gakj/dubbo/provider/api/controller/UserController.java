package com.gakj.dubbo.provider.api.controller;

import com.gakj.dubbo.provider.api.entity.User;
import com.gakj.dubbo.provider.api.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value="/user")
public class UserController {


    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/list",method=RequestMethod.GET)
	@ResponseBody
	public List<User> list(){
        return userService.getAll();
	}
}
