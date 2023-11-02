package com.youtube.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.Services.VideoService;
import com.youtube.models.Video;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
    
    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService){
        this.videoService=videoService;
    }

    @GetMapping
    public ResponseEntity<List<Video>> getVideos(){
        List<Video> videos=videoService.getVideos();
        return new ResponseEntity<>(videos,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable UUID id){
        videoService.removeVideo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
