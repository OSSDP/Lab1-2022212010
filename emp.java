package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("emp")

@NoArgsConstructor
@AllArgsConstructor
public class emp {
    @TableId(type=IdType.AUTO)
    private Integer id;

    private String username;
    private String password;
    private String name;
    private String gender;
    private String image;
    private String job;

    private Date entrydate;
    @TableField(exist = false)
    private String token;

    private Integer deptId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
