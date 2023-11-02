package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.VideoLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoLikeRepository extends JpaRepository<VideoLike,UUID> {

    
} 
