# Use an official OpenJDK runtime as a parent image
FROM openjdk:23-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the source code (if you don't already have it in the target folder)
COPY pom.xml .
COPY src ./src

# Run Maven to clean and install the dependencies and build the JAR
RUN mvn clean install

# Copy the built JAR file into the container
COPY target/hngStage0-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
