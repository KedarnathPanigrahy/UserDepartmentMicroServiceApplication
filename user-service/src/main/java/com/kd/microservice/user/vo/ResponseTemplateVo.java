package com.kd.microservice.user.vo;

import com.kd.microservice.user.entity.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private UserDetails user;
    private Department department;
}
