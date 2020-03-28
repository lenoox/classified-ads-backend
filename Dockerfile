FROM maven:3.5.0-jdk-8-alpine as build

RUN mkdir -p /home/app
WORKDIR /home/app
COPY pom.xml /home/app
COPY /mysql-data/wait/wait-for.sh /home/app/wait-for.sh
RUN mvn dependency:go-offline
COPY ./src/ /home/app/src/
RUN mvn package -DskipTests


FROM openjdk:8-jre-alpine
RUN mkdir -p /home/wait
COPY --from=build  /home/app/wait-for.sh /home/wait/wait-for.sh

COPY --from=build  /home/app/target/*.jar /usr/local/lib/app.jar
ENTRYPOINT ["sh","./home/wait/wait-for.sh","--timeout=260","database:3306","--","java","-jar","/usr/local/lib/app.jar"]