package com.test.springcloud.service;

import com.test.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/24
 **/
@Component //***
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(String dName) {
                return false;
            }

            @Override
            public Dept findById(Long deptNo) {
                return new Dept().setDeptNo(deptNo)
                        .setDName("该ID"+deptNo+"没有对应的信息，null---@HystrixCommand")
                        .setDbSource("no this database in MYSQL");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
