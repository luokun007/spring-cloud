package com.test.springcloud.service.impl;

import com.test.springcloud.dao.DeptDao;
import com.test.springcloud.entity.Dept;
import com.test.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept deptEntity) {
        return deptDao.addDept(deptEntity);
    }

    @Override
    public Dept findById(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
