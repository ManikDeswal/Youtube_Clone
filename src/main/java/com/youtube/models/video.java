package com.youtube.models;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="videos")
public class Video {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="id")
    private UUID id;

    @NotNull
    @Size(min=1)
    private String title;   

    private String description;

    @NotNull
    private String url;

    @NotNull
    private String thumbnail;

    public UUID getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

     public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url=url;
    }

    public String getThumbnail(){
        return thumbnail;
    }
    public void setThumbnail(String thumbnail){
        this.thumbnail=thumbnail;
    }

}
