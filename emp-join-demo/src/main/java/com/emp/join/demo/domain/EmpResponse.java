package com.emp.join.demo.domain;

import java.io.Serializable;

public class EmpResponse implements Serializable {
    private Object empRes;

    public Object getEmpRes() {
        return empRes;
    }

    public void setEmpRes(Object empRes) {
        this.empRes = empRes;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    private String Message;


}
