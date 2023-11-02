package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,UUID> {

    
} 
