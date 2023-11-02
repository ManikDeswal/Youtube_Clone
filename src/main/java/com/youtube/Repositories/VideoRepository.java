package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,UUID>{

    
} 
