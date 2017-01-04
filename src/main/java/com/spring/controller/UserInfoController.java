package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.entity.ResultDto;
import com.spring.entity.UserInfo;
import com.spring.service.UserInfoService;

@RestController
@RequestMapping({"/user"})
public class UserInfoController {
	@Autowired
    private UserInfoService Service;
	/**
	 * 查询
	 *user/getuser
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getuser")
	public ResultDto getFindUserInfoAll(){
		return new ResultDto(200,"成功",Service.getFindUserInfoAll());
	 }
	/**
	 * 添加
	 * user/getadduser?userName=12&userSex=男&userAge=16
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getadduser",method=RequestMethod.GET)
	public ResultDto getadduser(UserInfo user){
		return new ResultDto(200,"成功",Service.addByUserInfo(user));
	}
	/**
	 * 修改
	 * @param userName
	 * @param userid
	 * user/getupdateuser?userName=5454&userid=96939363564257285
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getupdateuser",method=RequestMethod.GET)
	public ResultDto getupdateuser(UserInfo user){
		try {
			if(Service.UpdateByUserInfo(user)>0){
				return new ResultDto(200,"成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResultDto(2001,"失败");
	}
	/**
	 * 修改
	 * @param userName
	 * @param userid
	 * user/getupdateuserByuserid?userName=张三&userAge=19&userid=96939363564257285
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getupdateuserByuserid",method=RequestMethod.GET)
	public ResultDto getupdateuserByuserid(String userName,String userAge,String userid){
		try {
			if(Service.UpdateByUserInfoByuserid(userName, userAge, userid)>0){
				return new ResultDto(200,"成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResultDto(2001,"失败！");
	}
}
