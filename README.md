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

Este projeto fornece uma API RESTful que permite buscar vídeos no YouTube via integração com a YouTube Data API v3 e armazenar resultados em um banco local SQLite. Pode ser utilizado como base para aplicações de consulta, análise ou gerenciamento de vídeos.

## Funcionalidades

- Buscar vídeos no YouTube com base em uma query.
- Persistir informações localmente em SQLite.
- Expor endpoints RESTful para integração com frontends ou outros sistemas.
- Facilitar customizações para outros tipos de consulta ou processamento.

## Pré-requisitos

- Java 21+
- Maven 3.8+
- (Opcional) Docker, caso queira rodar via container

## Como rodar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/apiYoutube.git
cd apiYoutube

# Execute o projeto
./mvnw clean spring-boot:run
```

O backend estará disponível em [http://localhost:8080](http://localhost:8080).

## Configuração

As configurações principais estão no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:sqlite:database.db
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=com.example.apiYoutube.config.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
youtube.api.key=SUA_CHAVE_AQUI
```

> **Atenção:** Substitua `SUA_CHAVE_AQUI` pela sua chave da API do YouTube.

## Estrutura do Projeto

```
backend_apiYoutube/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.example.apiYoutube/
│       │       ├── ApiYoutubeApplication.java
│       │       ├── controller/
│       │       │   └── VideoController.java
│       │       ├── service/
│       │       │   └── YouTubeApiService.java
│       │       ├── model/
│       │       │   └── Video.java
│       │       ├── repository/
│       │       │   └── VideoRepository.java
│       │       └── config/
│       │           └── SQLiteDialect.java
│       └── resources/
│           ├── application.properties
│           └── ...
├── pom.xml
```

## Endpoints Principais

| Método | Endpoint           | Descrição                         |
|--------|--------------------|-----------------------------------|
| GET    | `/api/buscar-videos?query=termo` | Busca vídeos no YouTube pela query |

Exemplo de uso:

```http
GET http://localhost:8080/api/buscar-videos?query=java
```

## Personalização

- Adicione novas entidades e endpoints conforme sua necessidade.
- Configure a persistência local para outros bancos se desejar.
- Implemente autenticação/autorização se necessário.

## Licença

Este projeto está sob a licença MIT.