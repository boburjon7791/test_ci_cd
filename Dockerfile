FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package

FROM openjdk:21
WORKDIR /app
COPY --from=builder /app/target/test_ci_cd.jar test_ci_cd.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/test_ci_cd.jar"]