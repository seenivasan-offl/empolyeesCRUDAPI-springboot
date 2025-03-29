package com.employee.seenivasan_offl.service;

import com.employee.seenivasan_offl.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Optional<Employee> getEmployeeById(Long id);
    Page<Employee> getAllEmployees(Pageable pageable);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    void incrementSalaries();
}
