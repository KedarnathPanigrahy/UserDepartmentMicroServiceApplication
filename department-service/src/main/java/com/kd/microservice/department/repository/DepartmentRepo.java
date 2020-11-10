package com.kd.microservice.department.repository;

import com.kd.microservice.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    //@Query("from Department dept where dept.departmentName=:departmentName")
    Department getDepartmrntByDepartmentName(String departmentName);

    Department getDepartmrntByDepartmentId(Long departmentId);
}
