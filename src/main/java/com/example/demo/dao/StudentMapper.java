package com.example.demo.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sidian
 * @date 19-7-6 下午5:12
 */
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    List<Student> selectAll();


    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}