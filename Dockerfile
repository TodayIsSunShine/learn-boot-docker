FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  ./target/*.jar /learn-boot-docker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/learn-boot-docker.jar"]

EXPOSE 8080