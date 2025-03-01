FROM openjdk:21-slim

WORKDIR /app

COPY target/SPE_Mini_Project-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

CMD ["java", "-jar", "app.jar"]
