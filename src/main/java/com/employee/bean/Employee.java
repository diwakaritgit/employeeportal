package com.employee.bean;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
public class Employee {
    private Long empId;
    private String salary;
    private String empName;
    private String address;

    public Employee(EmployeeForm empForm) {
        this.empId = empForm.getEmpId();
        this.empName = empForm.getEmpName();
        this.salary = empForm.getSalary();
        this.address = empForm.getAddress();
    }

    public Employee(Long empId, String empName, String salary, String address) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.address = address;
    }

}
