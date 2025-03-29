package com.employee.seenivasan_offl.service;

import com.employee.seenivasan_offl.model.Employee;
import com.employee.seenivasan_offl.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Constructor injection for EmployeeRepository
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }


    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        } else {
            throw new IllegalArgumentException("Employee not found");
        }
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void incrementSalaries() {
        // Retrieve all employees and update their salary by a factor
        Iterable<Employee> employees = employeeRepository.findAll();
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * 1.10); // example: 10% increase
            employeeRepository.save(employee);
        }
    }
}
