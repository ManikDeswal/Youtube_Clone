package com.youtube.models;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Subscriptions")
public class Subscription {
    
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    @Column(name="subscriber", columnDefinition = "BINARY(16)")
    private UUID subscriber;

    //GET Method
    public UUID getId(){
        return id;
    }

    public UUID getSubscriber(){
        return subscriber;
    }

    //SET Method
    public void setSubscriber(UUID subscriber){
        this.subscriber=subscriber;
    }
}
