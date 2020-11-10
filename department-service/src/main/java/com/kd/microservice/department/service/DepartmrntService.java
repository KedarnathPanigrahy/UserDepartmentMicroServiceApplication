package com.kd.microservice.department.service;

import com.kd.microservice.department.entity.Department;
import com.kd.microservice.department.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmrntService {

    @Autowired
    private DepartmentRepo repo;

    public Department saveDepartment(Department department) {
        log.info("DepartmrntService - saveDepartment");
        return repo.save(department);
    }

    public Department getDepartmentByName(String departmentName) {
        log.info("DepartmrntService - getDepartmentByName");
        return repo.getDepartmrntByDepartmentName(departmentName);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("DepartmrntService - getDepartmentById");
        return repo.getDepartmrntByDepartmentId(departmentId);
    }
}
