package com.kd.microservice.user.repository;

import com.kd.microservice.user.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

    UserDetails getUserDetailsByUserName(String userName);
}
