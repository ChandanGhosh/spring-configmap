FROM openjdk:8-jre-alpine
COPY build/libs/spring-configmap-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar app.jar --info