#FROM adoptopenjdk/openjdk11:alpine-jre
#FROM openjdk:11-jre-slim-buster
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/simpleserver-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas

ENTRYPOINT ["java","-jar","/app.jar"]
