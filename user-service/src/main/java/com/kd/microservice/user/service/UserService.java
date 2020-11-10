package com.kd.microservice.user.service;

import com.kd.microservice.user.entity.UserDetails;
import com.kd.microservice.user.repository.UserRepository;
import com.kd.microservice.user.vo.Department;
import com.kd.microservice.user.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository repository;

    @Autowired
    RestTemplate restTemplate;

    public UserDetails saveUser(UserDetails user) {
        log.debug("UserService - saveUser");
        return repository.save(user);
    }

    public ResponseTemplateVo getUserDetailsByUserName(String userName) {
        log.debug("UserService - getUserDetailsByUserName");
        ResponseTemplateVo vo = new ResponseTemplateVo();
        UserDetails user = repository.getUserDetailsByUserName(userName);
        Department department = restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);
        vo.setDepartment(department);
        vo.setUser(user);
        return vo;
    }
}
