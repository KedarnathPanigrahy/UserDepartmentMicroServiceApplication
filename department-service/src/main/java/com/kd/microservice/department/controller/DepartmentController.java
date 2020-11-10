package com.kd.microservice.department.controller;

import com.kd.microservice.department.entity.Department;
import com.kd.microservice.department.service.DepartmrntService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmrntService service;

    @PostMapping("/save")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        log.info("DepartmentController - saveDepartment");
        return new ResponseEntity<>(service.saveDepartment(department), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("DepartmentController - getDepartmentById");
        return new ResponseEntity<>(service.getDepartmentById(departmentId), HttpStatus.OK);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<Department> getDepartmentByName(@PathVariable("name") String departmentName) {
        log.info("DepartmentController - getDepartmentByName");
        return new ResponseEntity<>(service.getDepartmentByName(departmentName), HttpStatus.OK);
    }
}
