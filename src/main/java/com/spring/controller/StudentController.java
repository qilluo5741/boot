package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.ResultDto;
import com.spring.service.StudentService;

@RestController
@RequestMapping({"/student"})
public class StudentController {
	@Autowired
    private StudentService Service;
	/**
	 * student/getStudent
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getStudent")
	public ResultDto FindStudentAll(){
		//return new ResultDto(200,"成功",Service.FindStudentAll());
		try {
			if(Service.getFindStudentAll()!=null){
				return new ResultDto(200,"成功",Service.getFindStudentAll());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResultDto(200,"失败！");
	 }
}
