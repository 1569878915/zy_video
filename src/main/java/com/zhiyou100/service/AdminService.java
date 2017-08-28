package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.modle.Admin;

public interface AdminService {

	List<Admin> loginAdmin(String username, String password);

}
