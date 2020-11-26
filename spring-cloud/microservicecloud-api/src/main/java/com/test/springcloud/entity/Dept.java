package com.test.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptNo;

    private String dName;

    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }
}
