package com.management.svk.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.svk.model.User;
import com.management.svk.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUser() {

		List<User> findAll = userRepository.findAll().stream().filter(list -> list.getDeleteFlag().equals("0"))
				.collect(Collectors.toList());
//		if(findAll)
		return findAll;
	}

}
