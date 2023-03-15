package com.emp.join.demo.service;

import com.emp.join.demo.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getAllEmp();

    Object addEmpById(Emp emp);

    Object findByid(Integer id);
}
