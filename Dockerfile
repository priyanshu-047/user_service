# Step 1: Use a lightweight OpenJDK image as base
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the built JAR file into the container
COPY target/*.jar app.jar

# Step 4: Expose the port your app runs on
EXPOSE 8080

# Step 5: Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
