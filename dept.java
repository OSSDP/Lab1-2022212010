package com.example.springboot.entity;




import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@TableName("dept")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class dept {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    // 创建时间
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    // 修改时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
