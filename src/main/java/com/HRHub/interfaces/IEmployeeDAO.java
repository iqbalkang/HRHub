package com.HRHub.interfaces;

import com.HRHub.entities.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> getAllEmployees();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
