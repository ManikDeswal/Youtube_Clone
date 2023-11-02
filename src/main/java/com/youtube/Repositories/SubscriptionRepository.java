package com.youtube.Repositories;

import java.util.UUID;
import com.youtube.models.Subscription;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription,UUID>{

    
} 