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
@Table(name="Comments")
public class Comment {
    
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid")
    @Column(name="id",columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    @Column(name="text")
    private String text;

    public UUID getId(){
        return id;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
}
