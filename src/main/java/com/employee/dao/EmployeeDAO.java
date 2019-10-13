package com.employee.dao;


import com.employee.bean.Employee;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDAO {
    private static final Map<Long, Employee> empMap = new HashMap<Long, Employee>();



    static {
        initEmps();
    }

    private static void initEmps() {
        Employee emp1 = new Employee(1L, "Mukesh","8000","Sector 3");
        Employee emp2 = new Employee(2L, "Amit", "8500", "sector 9");
        Employee emp3 = new Employee(3L, "Sonam", "9000", "Sector 2");
        Employee emp4 = new Employee(4L, "Diwakar", "9600", "Sector 5");

        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
        empMap.put(emp4.getEmpId(), emp4);
    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }


}


