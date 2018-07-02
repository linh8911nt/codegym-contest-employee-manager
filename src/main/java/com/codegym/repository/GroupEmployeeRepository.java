package com.codegym.repository;

import com.codegym.model.GroupEmployee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupEmployeeRepository extends PagingAndSortingRepository<GroupEmployee, Long> {
}
