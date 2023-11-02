package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewRepository extends JpaRepository<View,UUID>{

    
} 