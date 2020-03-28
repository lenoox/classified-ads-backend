# Classified Ads Backend
Classified Ads - Spring Api 
## Technology Stack
 - Git flow
 - Docker
 - Swagger2
 - MariaDB
 - Spring Boot
 - [OpenJDK](https://openjdk.java.net/)*
## Requirements
 - [Docker](https://www.docker.com/)
## Run locally
 - Install Docker and Docker Compose.
 - Copy .env.example file to .env and edit database credentials there.
 - Copy dump.example.sql file to dump.sql in ./mysql-data/db/
 - Run command in your terminal to create network:
```
 docker network create api-network
```
 - Run command in your terminal to start container: 
```
 DOCKER_BUILDKIT=1 COMPOSE_DOCKER_CLI_BUILD=1 docker-compose -f docker-compose.dev.yml up --build
```
 - Run in browser
    - with swagger:
        - Start http://localhost:8081/swagger-ui.html to test all endpoints
    - without swagger:
        - Start http://localhost:8081/api/v1/items in your browser/postman.


*OpenJDK can be used only for non-commercial purposes!
