package com.spring.service;

import java.util.List;

import com.spring.entity.UserInfo;

public interface UserInfoService {
	//查询
	 public List<UserInfo> getFindUserInfoAll();
	 //添加
	 public int addByUserInfo(UserInfo user);
	 //修改
	 public int UpdateByUserInfo(UserInfo user);
	 //修改
	 public int UpdateByUserInfoByuserid(String userName,String userAge,String userid);
}
