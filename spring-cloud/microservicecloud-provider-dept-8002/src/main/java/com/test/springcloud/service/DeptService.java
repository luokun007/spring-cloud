package com.test.springcloud.service;

import com.test.springcloud.entity.Dept;

import java.util.List;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
public interface DeptService {


    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean addDept(Dept deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    Dept findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<Dept> findAll();
}
