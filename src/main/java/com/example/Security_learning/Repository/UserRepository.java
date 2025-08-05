package com.example.Security_learning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Security_learning.Entity.User;
// import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUsername(String name);
    
}
