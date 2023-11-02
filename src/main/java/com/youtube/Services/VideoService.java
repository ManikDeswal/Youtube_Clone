package com.youtube.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.Repositories.VideoRepository;
import com.youtube.models.Video;

@Service
public class VideoService {
    
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository){
        this.videoRepository=videoRepository;
    }

    public List<Video> getVideos(){
        return videoRepository.findAll();
    }

    public void removeVideo(UUID id){
        videoRepository.deleteById(id);
    }
}
