package com.example.students.dao;

import java.util.List;

import com.example.students.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface StudentDao {
	
	/**
	 * 用户数据新增
	 */
	 @Insert("insert into t_stu(stuId,name,department,major) values (#{stuId},#{name},#{department},#{major})")
	  void addStudent(Student student);
	 
	 /**
	  * 用户数据修改
	  */
	 @Update("update t_stu set name=#{name},department=#{department},major=#{major} where stuId=#{stuId}")
	  void updateStudent(Student student);

	 /**
	  * 用户数据删除
	 */
	 @Delete("delete from t_stu where stuId=#{stuId}")
	 void deleteStudent(String stuId);
	
	 /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT stuId,name,department,major FROM t_stu where stuId=#{stuId}")
    Student findById(String stuId);
}
