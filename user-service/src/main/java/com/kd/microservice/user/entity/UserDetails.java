package com.kd.microservice.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(unique = true)
    private String userName;
    @Column(unique = true)
    private String emailId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String mobNumber;
    private Long departmentId;
}
