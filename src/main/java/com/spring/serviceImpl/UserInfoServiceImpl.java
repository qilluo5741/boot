package com.spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.UserInfo;
import com.spring.mapper.UserInfoMapper;
import com.spring.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper mapper;
	
	@Override
	public List<UserInfo> getFindUserInfoAll() {
		return mapper.getFindUserInfoAll();
	}
	@Override
	public int addByUserInfo(UserInfo user) {
		return mapper.addByUserInfo(user);
	}
	@Override
	public int UpdateByUserInfo(UserInfo user) {
		return mapper.UpdateByUserInfo(user);
	}
	@Override
	public int UpdateByUserInfoByuserid(String userName, String userAge, String userid) {
		return mapper.UpdateByUserInfoByuserid(userName, userAge, userid);
	}
}
