FROM eclipse-temurin:17

COPY ca-certificates/russiantrustedca.crt /usr/local/share/ca-certificates/
RUN update-ca-certificates

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]