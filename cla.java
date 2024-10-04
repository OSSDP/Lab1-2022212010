package com.example.springboot.entity;



import com.baomidou.mybatisplus.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("cla")

@NoArgsConstructor
@AllArgsConstructor
public class cla {
    @TableId(type=IdType.AUTO)
    private Integer id;

    private String claname;
    private String claid;


    private Date startTime;

    private Date endTime;
    private String teacher;

}
