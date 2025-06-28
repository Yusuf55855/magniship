FROM maven:3.9.6-eclipse-temurin-21 AS build
# Menggunakan Maven + OpenJDK 21 terbaru

WORKDIR /app
COPY . .
WORKDIR /app/backend
RUN mvn package -DskipTests
# Build project pakai JDK 21

FROM eclipse-temurin:21-jdk-jammy
# Menggunakan JDK 21 untuk menjalankan aplikasi

WORKDIR /app
COPY --from=build /app/backend/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
