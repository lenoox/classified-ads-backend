# Classified Ads Backend
Classified Ads - Spring Api 
## Technology Stack
 - Git flow
 - Docker
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
 - Start http://localhost:8081 in your browser.


*OpenJDK can be used only for non-commercial purposes!
