package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Aadhar;
import com.example.demo.entity.User;
import com.example.demo.repo.AadharRepo;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private AadharRepo aadharRepo;

	public void saveUser() {
		User user = new User();
		user.setUserName("Google Prakash");
		userRepo.save(user);

		Aadhar aadhaar = new Aadhar();
		aadhaar.setCity("Jajpur");
		aadhaar.setCountry("India");
		aadhaar.setState("Odisha");

		aadharRepo.save(aadhaar);
	}

}
