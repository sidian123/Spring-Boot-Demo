package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

/**
 * @author sidian
 * @date 19-7-6 下午5:15
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    static Logger logger= LogManager.getLogger();

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> students(){
        logger.debug("get all student");
        return studentService.allStudent();
    }

    @GetMapping("/{id}")
    public Student student(@PathVariable("id") Long id){
        return studentService.selectByPrimaryKey(id);
    }

    @PostMapping("/")
    public boolean add(Student student){
        logger.debug("add a student");
        //模拟数据了
        student.setName("tom"+ (int)(Math.random()*100));
        student.setSex(Math.random()>0.5?"男":"女");
        student.setPhone(( (long) (Math.random()*10000000)));
        student.setCreatetime(LocalDateTime.now());

        studentService.insert(student);
        return true;
    }
}
