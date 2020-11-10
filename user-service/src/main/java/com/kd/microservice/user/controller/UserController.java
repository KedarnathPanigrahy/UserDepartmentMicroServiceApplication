package com.kd.microservice.user.controller;

import com.kd.microservice.user.entity.UserDetails;
import com.kd.microservice.user.service.UserService;
import com.kd.microservice.user.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserDetails> saveUser(@RequestBody UserDetails user) {
        log.debug("UserController - saveUser");
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<ResponseTemplateVo> getUserDetailsByUserName(@PathVariable("name") String userName) {
        log.debug("UserController - getUserDetailsByUserName");
        return new ResponseEntity<>(userService.getUserDetailsByUserName(userName), HttpStatus.OK);
    }
}
