package com.alamio.employee.service;


import com.alamio.employee.model.Employee;
import com.alamio.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployeeById(Long id) {


        Optional<Employee> optional = employeeRepository.findById(id);

        return optional.orElse(null);

    }


    public Employee getEmployeeByName(String name) {


        Optional<Employee> optional = employeeRepository.findByName(name);

        return optional.orElse(null);

    }


    public List<Employee> getAllEmployees() {


        List<Employee> list = employeeRepository.findAll();

        return list;

    }


    public void saveEmployee(Employee employee) {

        employeeRepository.save(employee);

    }


}
