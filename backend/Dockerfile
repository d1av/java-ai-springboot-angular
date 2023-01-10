FROM eclipse-temurin:17-jdk-alpine
WORKDIR /
VOLUME /tmp
COPY target/*.jar java-ai-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","java-ai-0.0.1-SNAPSHOT.jar"]
EXPOSE $PORT
