FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=build/libs/simpleserver-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas

ENTRYPOINT ["java","-jar","/app.jar"]
