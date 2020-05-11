package com.peng.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.peng.demo.pojo.TbUser;

//@Mapper
public interface TbUserMapper {

	@Select("select * from category_ where id=#{id}")
	TbUser findById(Integer id);
	
	@Select("select * from category_ ")
	List<TbUser> findAll();
	
}
