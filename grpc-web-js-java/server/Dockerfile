FROM openjdk:13-jdk-alpine
COPY hello-world-grpc-server/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]