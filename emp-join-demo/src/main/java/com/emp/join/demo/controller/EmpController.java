package com.emp.join.demo.controller;

import com.emp.join.demo.domain.EmpResponse;
import com.emp.join.demo.entity.Emp;
import com.emp.join.demo.repository.AddressRepository;
import com.emp.join.demo.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping(value = "/emp")
public class EmpController {

  private final Logger logger = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpService empService;

    @Autowired
    private AddressRepository   addressRepository; ;
    @CrossOrigin

    @PostMapping("/addEmp")
    public ResponseEntity<Object> addEmpByIdDB(@RequestBody Emp emp) {
//        addressRepository.save(emp.getAddress());
        addressRepository.saveAll(emp.getAddress());
        Object em = empService.addEmpById(emp);

        EmpResponse res = new EmpResponse();
        res.setEmpRes(em);
        res.setMessage("successfully added");
        logger.info("Emp Added {}", em);
        return new ResponseEntity<Object>(res, HttpStatus.OK);


    }

    @GetMapping("/findByid/{id}")
    public ResponseEntity<Object> findByid(@PathVariable("id") Integer id){
        EmpResponse res = new EmpResponse();
        res.setEmpRes(empService.findByid(id));
        res.setMessage("found");
        logger.info("Employees found id: {}",id);
        return new ResponseEntity<Object>(res,HttpStatus.OK);
    }
    @GetMapping("/allEmp")
    public ResponseEntity<EmpResponse> getAllEmp() {
        EmpResponse res = new EmpResponse();
        res.setEmpRes(empService.getAllEmp());
        res.setMessage("All Employees");
        logger.info("All emp info {}", res.getEmpRes());
        return new ResponseEntity<EmpResponse>(res, HttpStatus.OK);
    }
}
