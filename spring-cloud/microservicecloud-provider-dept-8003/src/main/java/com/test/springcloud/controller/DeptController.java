package com.test.springcloud.controller;

import com.test.springcloud.entity.Dept;
import com.test.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add/{dName}")
    public boolean addDept(@PathVariable("dName") String dName) {
        return deptService.addDept(new Dept(dName));
    }

    @RequestMapping(value = "/findById/{deptNo}", method = RequestMethod.GET)
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return deptService.findById(deptNo);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    /**
     * 增加自己服务描述的接口
     *
     * @return
     */
    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有多少个微服务" + list.size());

        //查询LINGLUOCLOUD-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-DEPT8001");

        //打印LINGLUOCLOUD-DEPT服务信息
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }
}
