package com.apiyoutube.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@Service
public class YouTubeApiService {

    @Value("${youtube.api.key}")
    private String apiKey;
    private static final String BASE_URL = "https://www.googleapis.com/youtube/v3/search";

    public Map buscarVideos(String query) {
        RestTemplate restTemplate = new RestTemplate();

        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .queryParam("part", "snippet")
                .queryParam("maxResults", 10)
                .queryParam("q", query)
                .queryParam("key", apiKey)
                .build()
                .toUriString();

        Map response = restTemplate.getForObject(url, Map.class);
        return response;
    }
}