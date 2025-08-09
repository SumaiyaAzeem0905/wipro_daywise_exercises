package com.exmple.UsersService.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.exmple.UsersService.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
