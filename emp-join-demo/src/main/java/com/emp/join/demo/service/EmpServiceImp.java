package com.emp.join.demo.service;


import com.emp.join.demo.entity.Emp;
import com.emp.join.demo.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImp implements EmpService{

    @Autowired
    private EmpRepository repo;
    @Override
    public List<Emp> getAllEmp() {
        return repo.findAll() ;
    }

    @Override
    public Object addEmpById(Emp emp) {
        repo.save(emp);
        return emp;
    }

    @Override
    public Object findByid(Integer id) {
        return repo.findById(id);
    }
}
