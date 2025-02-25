package com.example.test.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Long countById(Integer id);
    List<User> findByFirstNameContainingIgnoreCase(String keyword);
}
