package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.model.Student;
import com.example.demo.dao.StudentMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author sidian
* @date 19-7-6 下午5:12
*/
@Service
@Transactional
public class StudentService{

    @Resource
    private StudentMapper studentMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    
    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    public List<Student> allStudent(){
        return studentMapper.selectAll();
    }
}
