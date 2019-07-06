package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * @author sidian
 * @date 19-7-6 下午5:12
 */
@Data
public class Student {
    private Long id;

    private String name;

    private String sex;

    private Long phone;

    private LocalDateTime createtime;
}