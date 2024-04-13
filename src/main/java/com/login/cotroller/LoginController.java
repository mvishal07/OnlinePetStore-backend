package com.login.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.LoginEntity;
import com.login.repo.CustomerRepo;
import com.login.repo.LoginRepo;
import com.login.service.LoginService;


@CrossOrigin("*")
@RestController
public class LoginController {
	
	@Autowired 
	LoginRepo repo;
	
	@Autowired
	LoginService lgservice;
	
	@PostMapping("/login/user/add")
	public LoginEntity adduser(@RequestBody LoginEntity user) {
		return lgservice.addNewUser(user);
	}
	
	@GetMapping("/login")
	public String checkLogin(@RequestParam String email,String password) {
		return lgservice.checkIsvaliduser(email,password);
	}
	
	@GetMapping("/nm")
	public LoginEntity getdata(@RequestParam String email) {
		LoginEntity user = repo.findByEmail(email);
		if((user != null)){
			return user;
		}
		return repo.save(user);
	}
	
	@Autowired 
	CustomerRepo crepo;
	
	@PostMapping("/cust")
	public CustomerDetails addcust(@RequestBody CustomerDetails customer) {
		return lgservice.addcustomer(customer);
	}
	
	@GetMapping("/puppy")
	public List<CustomerDetails> getData() {
		return lgservice.getDetails();
	}
	
	
}
