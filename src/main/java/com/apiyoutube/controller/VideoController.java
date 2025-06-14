package com.apiyoutube.controller;

import com.apiyoutube.service.YouTubeApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Controller responsável por expor endpoints relacionados a vídeos do YouTube.
 * Esta classe não deve ser estendida. Se necessário customizar comportamentos,
 * utilize composição ao invés de herança.
 */

@RestController
@RequestMapping("/api")
public final class VideoController {

    /** Serviço de integração com a API do YouTube. */
    private final YouTubeApiService youTubeApiService;

    /**
     * Construtor do controller, com injeção de dependência.
     * @param youTubeApiService Serviço de integração com a API do YouTube.
     */
    public VideoController(final YouTubeApiService service) {
        this.youTubeApiService = service;
    }

    /**
     * Endpoint para buscar vídeos do YouTube pelo termo informado.
     * @param query Termo de busca.
     * @return Resultado da busca na API do YouTube.
     */
    @GetMapping("/buscar-videos")
    public Map<String, Object> buscarVideos(@RequestParam String query) {
        return youTubeApiService.buscarVideos(query);
    }
}
