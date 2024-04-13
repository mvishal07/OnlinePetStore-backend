package com.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.cotroller.CustomerDetails;
import com.login.entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, String>{


	LoginEntity findByEmail(String email);

	

}
