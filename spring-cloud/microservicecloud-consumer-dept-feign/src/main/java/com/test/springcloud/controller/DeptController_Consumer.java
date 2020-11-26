package com.test.springcloud.controller;

import com.test.springcloud.entity.Dept;
import com.test.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/add/{dName}")
    public boolean add(@PathVariable("dName") String dName) {
        return deptClientService.addDept(dName);
    }

    @RequestMapping(value = "/consumer/findById/{deptNo}")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return deptClientService.findById(deptNo);
    }

    @RequestMapping(value = "/consumer/findAll")
    public List<Dept> findAll() {
        return deptClientService.findAll();
    }
}
