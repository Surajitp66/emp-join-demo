package com.emp.join.demo.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Emp_Address")
public class EmpAddress {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer AddressId;

    private String city;

    private  Integer pinCode;
    private BigInteger mobile_no;
//    private String address;


}
