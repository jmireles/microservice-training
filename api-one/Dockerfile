# Pull base image.
FROM openjdk:8

EXPOSE 8080

ADD api-one-docker-0.1.0.jar app.jar

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]