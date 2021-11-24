package com.project.webNotes.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
	User findByUsername(String username);
}