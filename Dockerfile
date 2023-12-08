FROM openjdk:11

COPY target/app.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080