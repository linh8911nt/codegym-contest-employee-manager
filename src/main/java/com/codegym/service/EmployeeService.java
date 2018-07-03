package com.codegym.service;

import com.codegym.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    Page<Employee> findAllEmployee(Pageable pageable);

    Iterable<Employee> findAllByEmployeeName(String name);

    Employee findById(Long id);

    Employee save(Employee employee);

}
