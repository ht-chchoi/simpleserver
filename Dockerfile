#FROM adoptopenjdk/openjdk11:alpine-jre
#FROM openjdk:8-jdk-alpine
FROM openjdk:11
ARG JAR_FILE=build/libs/simpleserver-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas

ENTRYPOINT ["java","-jar","/app.jar"]
