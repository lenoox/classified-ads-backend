# Classified Ads Backend
Classified Ads - Spring Api <br />
Project Classified Ads has frontend repository in [Classified Ads - Frontend](https://github.com/lenoox/classified-ads-frontend)
### Technology Stack
 - Git flow
 - Docker
 - Swagger2
 - MariaDB
 - Spring Boot
 - Maven
 - [OpenJDK](https://openjdk.java.net/)*
## Run locally with Maven 
#### Requirements
 - [OpenJDK](https://jdk.java.net/13/)* or [JDK](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html)**
#### Run project

 - Install OpenJDK or JDK.
 - Make a copy of the application-dev.properties.example file and rename it to application-dev.properties - then edit the database credentials there.
 - In your terminal go to the project folder and run a command to start the project:
```
/mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```
 _In Spring right now the dev profile is recommended._
 - Import insert.sql file to your database from ./mysql-data/insert_data/ directory.
 - Run in a browser
    - with swagger:
        - Start http://localhost:8081/swagger-ui.html to test all endpoints
    - without swagger:
        - Start http://localhost:8081/api/v1/items in your browser/postman.

## Run locally with docker 
#### Requirements
 - [Docker](https://www.docker.com/products/docker-desktop)***
#### Run project
You can choose predev or dev docker-compose config. Only predev config is with database container.
 - Install Docker and Docker Compose.
 - Make a copy of these files and change its names to the ones below:
    - .env.example to .env - then edit database credentials there.
    - application-predev.properties.example to application-predev.properties - then paste the credentials from .env file there.
 - Run command in your terminal and type root account password (which is MYSQL_ROOT_PASSWORD value in .env file) to insert data in mysql container:
```
docker exec -it databasepredev sh
sh ./insert_data/insert.sh 
```
 - Run command to create network:
```
 docker network create api-network
```
 - In your terminal go to the project folder and run a command to start the container: 
```
 DOCKER_BUILDKIT=1 COMPOSE_DOCKER_CLI_BUILD=1 docker-compose -f docker-compose.predev.yml up --build
```
 - Run in a browser
    - with swagger:
        - Start http://localhost:8081/swagger-ui.html to test all the endpoints
    - without swagger:
        - Start http://localhost:8081/api/v1/items in your browser/postman.

*OpenJDK can be used only for non-commercial purposes!<br />
**JDK is free but only for development purposes!<br />
***You can install it on Mac OS X, Linux, Microsoft Windows 10 Professional or Enterprise 64-bit. Windows 10 Home Edition is not supported.
