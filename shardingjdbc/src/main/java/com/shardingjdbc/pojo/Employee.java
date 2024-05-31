package com.shardingjdbc.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("employee")
@Data
public class Employee {

    @TableId("id")
    private Long id;

    private String username;

    private String phone;

}
