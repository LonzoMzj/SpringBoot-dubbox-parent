package com.peng.demo.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.peng.demo.pojo.TbUser;
import com.peng.demo.service.UserService;
 
@Controller
public class UserController {
	
	@Reference
	private UserService userService;
	
	@RequestMapping("/categories/{id}")
	@ResponseBody
	public List<TbUser> findById(Integer id){
		List<TbUser> list = new ArrayList<TbUser>();
		list.add(userService.findById(id));
		return list;
	}
	
	@GetMapping("/categories")
    public String listCategory(Model m) {
    	List<TbUser> page = userService.findAll();
    	m.addAttribute("page", page);
        return "listCategory";
    }
	
	@RequestMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("name", "thymeleaf");
        m.addAttribute("isTrue", false);
        Date date =new Date();
        m.addAttribute("now", date);
        return "hello";
    }
	@DeleteMapping("/categories/{id}")
	public String delete(TbUser thUser) {
    	System.out.println("=="+thUser.getId());
        return "redirect:/categories";
    }
	@GetMapping("/categories/{id}")
    public String getCategory(TbUser thUser,Model m) throws Exception {
		System.out.println("1111"+thUser.getId());

    	return "editCategory";
    }
 
}
