FROM openjdk:17-jdk-alpine
# Menggunakan image dasar Java 17

ARG JAR_FILE=target/*.jar
# Mendefinisikan variable untuk lokasi JAR hasil build

COPY ${JAR_FILE} app.jar
# Copy file JAR ke dalam image

ENTRYPOINT ["java", "-jar", "/app.jar"]
# Menjalankan aplikasi Spring Boot
