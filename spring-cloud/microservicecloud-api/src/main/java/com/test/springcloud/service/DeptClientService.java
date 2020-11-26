package com.test.springcloud.service;

import com.test.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/23
 **/
@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add/{dName}")
    boolean addDept(@PathVariable("dName") String dName);

    @RequestMapping(value = "/dept/findById/{deptNo}", method = RequestMethod.GET)
    Dept findById(@PathVariable("deptNo") Long deptNo);

    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    List<Dept> findAll();
}
