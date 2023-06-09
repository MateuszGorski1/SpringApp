FROM eclipse-temurin:17-jdk-alpine
ENV DB_HOST=db
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
