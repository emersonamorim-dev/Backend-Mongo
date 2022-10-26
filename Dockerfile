FROM openjdk:17

WORKDIR /app

EXPOSE 8081

ENTRYPOINT ["java","-jar","target/Backend-Mongo-1.0.0.jar"]
