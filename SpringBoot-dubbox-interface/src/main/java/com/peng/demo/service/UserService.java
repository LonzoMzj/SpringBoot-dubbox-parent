package com.peng.demo.service;

import java.util.List;

import com.peng.demo.pojo.TbUser;

public interface UserService {
	TbUser findById(Integer id);
	
	List<TbUser> findAll();

}
