package com.system.webadmin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class city
{
    private Integer id;
    private String name;
    private String state;
    private String country;
}
