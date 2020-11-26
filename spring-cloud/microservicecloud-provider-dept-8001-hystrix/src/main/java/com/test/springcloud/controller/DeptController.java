package com.test.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.springcloud.entity.Dept;
import com.test.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@RestController
@RequestMapping(value = "/dept")
public class DeptController {


    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/findById/{deptNo}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        Dept dept=deptService.findById(deptNo);
        if (dept==null){
            throw  new RuntimeException("该id"+deptNo+"没有查询到信息！！");
        }
        return dept;
    }

   public Dept processHystrix_Get(@PathVariable("deptNo") Long deptNo){
        return new Dept().setDeptNo(deptNo)
                .setDName("该ID"+deptNo+"没有对应的信息，null---@HystrixCommand")
                .setDbSource("no this database in MYSQL");
   }

}
