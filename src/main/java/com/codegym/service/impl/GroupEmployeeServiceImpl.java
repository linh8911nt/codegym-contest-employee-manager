package com.codegym.service.impl;

import com.codegym.model.GroupEmployee;
import com.codegym.repository.GroupEmployeeRepository;
import com.codegym.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupEmployeeServiceImpl implements GroupEmployeeService {

    private GroupEmployeeRepository groupEmployeeRepository;

    @Autowired
    public GroupEmployeeServiceImpl(GroupEmployeeRepository groupEmployeeRepository) {
        this.groupEmployeeRepository = groupEmployeeRepository;
    }

    @Override
    public Iterable<GroupEmployee> findAll() {
        return groupEmployeeRepository.findAll();
    }

    @Override
    public GroupEmployee findById(Long id) {
        return groupEmployeeRepository.findOne(id);
    }
}
