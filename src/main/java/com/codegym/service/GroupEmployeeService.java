package com.codegym.service;

import com.codegym.model.GroupEmployee;

public interface GroupEmployeeService {

    Iterable<GroupEmployee> findAll();

    GroupEmployee findById(Long id);
}
