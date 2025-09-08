# Use OpenJDK 8 as the base image
FROM openjdk:8-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy your built jar file into the container
COPY build/libs/Bye-World-java*.jar app.jar

# Run the jar file
CMD ["java", "-jar", "app.jar"]
