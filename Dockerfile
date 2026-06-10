FROM alpine:latest
RUN apk add --no-cache openjdk25-jdk
WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
