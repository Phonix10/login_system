package com.example.Security_learning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Security_learning.Entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long>{
   User findByEmail(String email);
    
}
