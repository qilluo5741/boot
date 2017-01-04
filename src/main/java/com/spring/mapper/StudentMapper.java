package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.spring.entity.Student;

@Mapper
public interface StudentMapper {
	 //查询
	 @Select("select * from student")  
	 public List<Student> FindStudentAll();
	 @Results({
			@Result(property="stuId",column="stuId"),
			@Result(property="stuName",column="stuName"),
			@Result(property="stuGender",column="stuGender"),
			@Result(property="cls.clsId",column="clsId"),
			@Result(property="cls.clsName",column="clsName"),
		})
	 @Select("select * from student s LEFT JOIN class c on s.clsId=c.clsId")  
	 public List<Student> getFindStudentAll();
}
