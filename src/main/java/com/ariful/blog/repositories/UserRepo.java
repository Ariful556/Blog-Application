package com.ariful.blog.repositories;

import com.ariful.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
