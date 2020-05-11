package com.peng.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.peng.demo.mapper.TbUserMapper;
import com.peng.demo.pojo.TbUser;
import com.peng.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	TbUserMapper mapper;
	
	public TbUser findById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}

	@Override
	public List<TbUser> findAll() {

		return mapper.findAll();
	}

}
