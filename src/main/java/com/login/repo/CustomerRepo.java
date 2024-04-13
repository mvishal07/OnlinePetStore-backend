package com.login.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.cotroller.CustomerDetails;

public interface CustomerRepo extends JpaRepository<CustomerDetails, Long>{
}