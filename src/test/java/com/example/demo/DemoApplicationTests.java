package com.example.demo;

import com.example.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    private static RestTemplate restTemplate=new RestTemplate();
    private static final String URI_PREFIX="http://localhost:8080/student";

    @Test
    public void contextLoads() {
        //添加
        restTemplate.postForObject(URI_PREFIX+"/",null,Boolean.class);
        //查询
        List<Student> students= (List<Student>) restTemplate.exchange(URI_PREFIX + "/", HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {}).getBody();

        students.forEach(student -> System.out.println(student));
    }

}
