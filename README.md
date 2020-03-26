# Classified Ads Backend
Classified Ads - Spring Api 
##Technology Stack
 - Git flow
 - Docker
 - MariaDB
 - Spring Boot
 - [OpenJDK](https://openjdk.java.net/)*
##Requirements
 - [Docker](https://www.docker.com/)
##Run locally
 - Install Docker and Docker Compose.
 - Copy .env.example file to .env and edit database credentials there.
 - Create dump.sql in ./mysql-data/db/
 - Run command in your terminal to build container:
```
docker-compose -f docker-compose.dev.yml build
```
 - Run command in your terminal to start container: 
```
 docker-compose -f docker-compose.dev.yml up -d
```
 - Start http://localhost:8081 in your browser.


*OpenJDK can be used only for non-commercial purposes!
