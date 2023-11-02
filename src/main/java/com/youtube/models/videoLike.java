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
@Table(name ="VideoLikes")
public class VideoLike {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name="id",columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    @Column(name="LikesCount")
    private Integer count;

    public UUID getId(){
        return id;
    }

    public Integer getCount(){
        return count;
    }

    public void SetCount(Integer count){
        this.count=count;
    }

}
