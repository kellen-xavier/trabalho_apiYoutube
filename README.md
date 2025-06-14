# apiYoutube

Projeto backend em Java + Spring Boot, com integração à API do YouTube e persistência local em SQLite.

## Sumário

- [Descrição](#descrição)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Como rodar](#como-rodar)
- [Configuração](#configuração)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Endpoints Principais](#endpoints-principais)
- [Personalização](#personalização)
- [Licença](#licença)

---

## Descrição

API RESTful para busca de vídeos do YouTube utilizando a YouTube Data API v3, construída com Java 21, Spring Boot 3.5.x e persistência local via SQLite. 
A proposta do projeto deve seguir boas práticas de organização, utilização de DTOs para respostas e documentação automática via Swagger.

## Funcionalidades

- Buscar vídeos do YouTube por palavra-chave, retornando dados organizados via DTO.
- Endpoint de status de saúde na raiz (`/`).
- Documentação automática e interativa da API com Swagger.
- Persistência local pronta para expansão.

## Pré-requisitos

- Java 21+
- Maven 3.8+
- (Opcional) Docker, caso queira rodar via container

## Como rodar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/kellen-xavier/trabalho_apiYoutube.git
   cd trabalho_apiYoutube
   ```

2. **Configure sua chave da API do YouTube:**
    - Edite o arquivo `src/main/resources/application.properties`:
      ```
      youtube.api.key=SUA_CHAVE_AQUI
      ```
    - Nunca compartilhe sua chave real publicamente!

3. **Build e execute via terminal:**
   ```bash
   ./mvnw clean spring-boot:run
   ```
    - O backend estará disponível em [http://localhost:8080](http://localhost:8080)


## Configuração

As configurações principais estão no arquivo de exemplo `src/main/resources/application-example.properties`:

```properties
spring.application.name=apiYoutube
spring.datasource.url=jdbc:sqlite:database.db
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=com.example.apiYoutube.config.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
youtube.api.key=SUA_CHAVE_AQUI
```

> **Atenção:** Substitua `SUA_CHAVE_AQUI` pela sua chave da API do YouTube.

## Estrutura do Projeto

```
trabalho_apiYoutube/
├── src/
│   └── main/
│       ├── java/com/example/apiYoutube/
│       │   ├── ApiYoutubeApplication.java
│       │   ├── controller/
│       │   │   ├── StatusController.java
│       │   │   └── VideoController.java
│       │   ├── dto/
│       │   │   ├── VideoDTO.java
│       │   │   └── VideoSearchResponseDTO.java
│       │   ├── service/
│       │   │   └── YouTubeApiService.java
│       │   └── config/
│       │       └── SQLiteDialect.java
│       └── resources/
│           ├── application.properties
│           └── ...
├── pom.xml
└── README.md
```

## Endpoints Principais

| Método | Endpoint           | Descrição                         |
|--------|--------------------|-----------------------------------|
| GET    | `/api/buscar-videos?query=termo` | Busca vídeos no YouTube pela query |

Após subir o projeto, acesse:

- [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

Explore e teste todos os endpoints de forma interativa!

Exemplo de uso:

```http
GET http://localhost:8080/api/buscar-videos?query=java
```

## Personalização

- Adicione novas entidades e endpoints conforme sua necessidade.
- Configure a persistência local para outros bancos se desejar.
- Implemente autenticação/autorização se necessário.

## 💡 Boas práticas e dicas

- **Nunca commite sua chave real de API**: use arquivos de exemplo, variáveis de ambiente ou exclua o arquivo do `.gitignore`.
- **Respostas organizadas**: utilize DTOs para entregar respostas padronizadas e limpas.
- **Estrutura modular**: cada camada (controller, service, dto, config) tem sua responsabilidade.
- **Documentação automática**: facilite a integração com Swagger/OpenAPI.
- **Pronto para expansão**: basta criar novos endpoints e serviços conforme suas necessidades.

---
