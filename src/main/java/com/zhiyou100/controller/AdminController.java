package com.zhiyou100.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhiyou100.modle.Admin;
import com.zhiyou100.service.AdminService;

@Controller
@RequestMapping("/index")
public class AdminController {
@Autowired
AdminService as;
@RequestMapping(value="/index.action" ,method=RequestMethod.GET )
public String index(){
	
	return "/index/admin";
	
}
@RequestMapping(value="/index.action" ,method=RequestMethod.POST )
public String indexFiandTheUserNameAndPassWord(String username,String password,HttpSession session){
	List<Admin> list=as.loginAdmin(username,password);
	System.out.println(list);
	String str=null;
	if(list.isEmpty()){
		str="/index/admin";
	}
	else{
		session.setAttribute("list1", list);
		str="redirect:/video/videoList.action";
		///videoList.action
	}
		return str;
	
}

}
