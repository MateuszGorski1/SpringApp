FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ENV DB_HOST=db
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
