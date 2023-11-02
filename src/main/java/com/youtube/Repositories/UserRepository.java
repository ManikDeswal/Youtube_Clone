package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,UUID>{

} 
