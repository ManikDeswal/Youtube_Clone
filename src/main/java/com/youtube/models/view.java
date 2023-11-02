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
@Table(name = "views")
public class View {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @NotNull
    @Column(name="viewCount")
    private Integer count;

    public UUID getId(){
        return id;
    }
    public Integer getViewCount(){
        return count;
    }

    public void setViewCount(Integer count){
        this.count=count;
    }
    
}
