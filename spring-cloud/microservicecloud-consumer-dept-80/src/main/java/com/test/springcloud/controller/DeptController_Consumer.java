package com.test.springcloud.controller;

import com.test.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@RestController
@RequestMapping(value = "/consumer")
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX = "http://localhost:8001/dept";
      private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEPT/dept";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add/{dName}")
    public boolean add(@PathVariable("dName") String dName) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/add/"+dName, Boolean.class);
    }

    @RequestMapping(value = "/findById/{deptNo}")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/findById/" + deptNo, Dept.class);
    }

    @RequestMapping(value = "/findAll")
    public List<Dept> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/findAll", List.class);
    }

    @RequestMapping(value = "/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/discovery", Object.class);
    }
}
