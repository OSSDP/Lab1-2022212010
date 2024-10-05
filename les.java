package com.example.springboot.entity;

//kkkkkkkkkkkkk

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("les")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class les {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String lessonname;
    private String lesteacher;
    private Integer lesmark;
    // 创建时间
    private String lesintroduction;

}
