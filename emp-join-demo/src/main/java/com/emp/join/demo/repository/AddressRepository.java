package com.emp.join.demo.repository;


import com.emp.join.demo.entity.EmpAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<EmpAddress,Integer> {
}
