# Use a lightweight Java base image optimized for Spring Boot
FROM openjdk:17-slim

# Set a working directory for future commands
WORKDIR /app

# Copy the JAR file from the build to the image 
COPY target/demo-config-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Spring Boot typically uses
EXPOSE 8080

# Command to run the Spring Boot application inside the container
ENTRYPOINT ["java","-jar","app.jar"] 