FROM openjdk:21
EXPOSE 8080
ADD target/test_ci_cd.jar test_ci_cd.jar
ENTRYPOINT ["java","-jar","/test_ci_cd.jar"]