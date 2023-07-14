package com.spring.user.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.user.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	
 
}
