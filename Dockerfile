FROM eclipse-temurin:25-jre

WORKDIR /app

COPY target/product-api-devsecops-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
