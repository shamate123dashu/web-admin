package com.system.webadmin.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user01")
public class user01
{
    private Integer id;
    private String name;
    private String  age;
    private String email;
}
