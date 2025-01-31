FROM openjdk:23-jdk-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install

COPY target/hngStage0-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]