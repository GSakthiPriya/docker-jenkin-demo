FROM openjdk:11-ea-17-jdk-slim
EXPOSE 8094
ADD target/docker-jenkin-demo-0.0.1-SNAPSHOT.jar docker-jenkin-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker-jenkin-demo-0.0.1-SNAPSHOT.jar"]
