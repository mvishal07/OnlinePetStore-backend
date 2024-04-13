package com.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.cotroller.CustomerDetails;
import com.login.entity.LoginEntity;
import com.login.repo.CustomerRepo;
import com.login.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired 
	LoginRepo repo;
	public LoginEntity addNewUser(LoginEntity user) {
	
		return repo.save(user);
	}

	public String checkIsvaliduser(String email, String password) {
		
		LoginEntity user = repo.findByEmail(email);
		if((user != null)&&(user.getPassword().contentEquals(password)== true)){
			return "success";
		}
		return "failure";
	}

	public LoginEntity getnames(String email) {
		LoginEntity user = repo.findByEmail(email);
		if((user != null)){
			return user;
		}
		return repo.save(user);
	}
	
	@Autowired
	CustomerRepo custrepo;

	public CustomerDetails addcustomer(CustomerDetails customer) {
		// TODO Auto-generated method stub
		return custrepo.save(customer);
	}

	public List<CustomerDetails> getDetails() {
		// TODO Auto-generated method stub
		return custrepo.findAll();
	}

}
