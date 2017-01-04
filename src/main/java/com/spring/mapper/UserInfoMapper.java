package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.spring.entity.UserInfo;
@Mapper
public interface UserInfoMapper {
	 //查询
	 @Select("select * from UserInfo")  
	 public List<UserInfo> getFindUserInfoAll();
	 //添加
	 @Insert("INSERT INTO UserInfo(userid,userName,userSex,userAge) VALUES(UUID_SHORT(),#{userName},#{userSex},#{userAge})")  
	 public int addByUserInfo(UserInfo user);
	 //修改
	 @Update("update UserInfo set userName=#{userName} where userid=#{userid}")
	 public int UpdateByUserInfo(UserInfo user);
	 //修改
	 @Update("update UserInfo set userName=#{userName},userAge=#{userAge} where userid=#{userid}")
	 public int UpdateByUserInfoByuserid(@Param("userName")String userName,@Param("userAge")String userAge,@Param("userid")String userid);
}
