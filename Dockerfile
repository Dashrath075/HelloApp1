FROM openjdk:11-jdk-alpine
ADD target/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java","-jar","spring-docker.jar"]