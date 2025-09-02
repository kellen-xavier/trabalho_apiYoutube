package com.apiyoutube;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.apiyoutube.service.YouTubeApiService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class YouTubeApiServiceTests {

    //Dado que o usuároio na barra de buscar vídeos do youtube digite uma banda
    // Quando o usuário clicar no botão buscar
    //Então o sistema deverá retornar uma lista de vídeos relacionados a banda buscada

	@Test
	void buscarVideos_deveRetornarBuscaComSucesso() {
        //Arrange
        YouTubeApiService service = new YouTubeApiService();
        //Act
        List<VideoDTO> resultado = service.buscarVideos("Linkin Park");

        //Assert
        AssertNot(resultado, "Não deve retornar Nulo");
	}

}
