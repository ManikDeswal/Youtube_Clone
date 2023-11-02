package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.VideoLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoLikeRepository extends JpaRepository<VideoLike,UUID> {

    
} 
