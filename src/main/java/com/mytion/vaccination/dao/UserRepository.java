package com.mytion.vaccination.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytion.vaccination.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
