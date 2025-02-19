#FROM maven:3.9-eclipse-temurin-21 AS builder
#WORKDIR /.
#COPY . .
#RUN mvn clean package -DskipTests

FROM openjdk:21
#COPY --from=builder /target/test_ci_cd.jar test_ci_cd.jar
COPY /target/test_ci_cd.jar test_ci_cd.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/test_ci_cd.jar"]