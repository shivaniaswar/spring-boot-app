FROM openjdk:11

COPY target/WebService2-0.0.1-SNAPSHOT.war  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "WebService2-0.0.1-SNAPSHOT.war"]

EXPOSE 8080
