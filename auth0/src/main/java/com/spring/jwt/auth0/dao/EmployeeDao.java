package com.spring.jwt.auth0.dao;

import com.spring.jwt.auth0.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 6/29/2021
 */
@Repository
public class EmployeeDao {

    private static final Map<String, Employee> empMap = new HashMap<>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Employee emp1 = new Employee("E01", "Smith", "Clerk");
        Employee emp2 = new Employee("E02", "Allen", "Salesman");
        Employee emp3 = new Employee("E03", "Jones", "Manager");

        empMap.put(emp1.getEmpNo(), emp1);
        empMap.put(emp2.getEmpNo(), emp2);
        empMap.put(emp3.getEmpNo(), emp3);
    }

    public Employee getEmployee(String empNo) {
        return empMap.get(empNo);
    }

    public Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public Employee updateEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public void deleteEmployee(String empNo) {
        empMap.remove(empNo);
    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        return new ArrayList<>(c);
    }

}
