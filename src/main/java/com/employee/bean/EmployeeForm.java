package com.employee.bean;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class EmployeeForm {

    private Long empId;
    private String salary;
    private String empName;
    private String address;
}
