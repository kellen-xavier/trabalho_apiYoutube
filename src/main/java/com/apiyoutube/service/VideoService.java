package com.apiyoutube.service;

import com.apiyoutube.model.Video;
import com.apiyoutube.repository.VideoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<Video> listarTodos() {
        return videoRepository.findAll();
    }
}