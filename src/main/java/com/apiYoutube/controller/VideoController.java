package com.example.apiYoutube.controller;

import com.example.apiYoutube.service.YouTubeApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class VideoController {
    private final YouTubeApiService youTubeApiService;

    public VideoController(YouTubeApiService youTubeApiService) {
        this.youTubeApiService = youTubeApiService;
    }

    @GetMapping("/buscar-videos")
    public Map<String, Object> buscarVideos(@RequestParam String query) {
        return youTubeApiService.buscarVideos(query);
    }
}