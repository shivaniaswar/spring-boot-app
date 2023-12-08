FROM openjdk:11

COPY target/spring-backend-app.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "spring-backend-app.jar"]

EXPOSE 8080
