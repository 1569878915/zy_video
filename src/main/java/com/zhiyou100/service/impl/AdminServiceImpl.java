package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.AdminMapper;
import com.zhiyou100.modle.Admin;
import com.zhiyou100.modle.AdminExample;
import com.zhiyou100.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
@Autowired
AdminMapper am;
@Override
public List<Admin> loginAdmin(String username, String password) {
	
	//String str = DigestUtils.md5DigestAsHex(password.getBytes());
	AdminExample ae=new AdminExample();
	ae.createCriteria().andLoginNameEqualTo(username).andLoginNameEqualTo(password);
	 return am.selectByExample(ae);
}
}
