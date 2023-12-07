package com.wcs.WebService2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wcs.WebService2.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUid(int uid);

	

}
