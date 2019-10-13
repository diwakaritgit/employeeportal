package com.employee.controller;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;
    /**
     * @return {@link List} a response reflecting the all employee lists.
     */

    @ResponseBody
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/employees",method = RequestMethod.GET)
    public List<Employee> getEmployees() {

        List<Employee> sortedEmpList = employeeDAO.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getEmpName))
                .collect(Collectors.toList());

        return sortedEmpList;
    }
}
