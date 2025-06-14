package com.example.apiYoutube.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class YouTubeApiService {

    @Value("${youtube.api.key}")
    private String apiKey;

    // Exemplo de método que busca vídeos (apenas simulação)
    public Map<String, Object> buscarVideos(String query) {
        Map<String, Object> result = new HashMap<>();
        result.put("query", query);
        result.put("mensagem", "Aqui retorna os vídeos encontrados com a API do YouTube APÓS CONFIG.");
        return result;
    }
}