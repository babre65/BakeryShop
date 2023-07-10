package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long> {
}
