FROM openjdk:8-jdk-alpine as build
WORKDIR /home/app/
COPY . /home/app/
RUN ./mvnw clean package

FROM openjdk:8-jre-alpine
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]