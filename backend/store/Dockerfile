FROM eclipse-temurin:17

RUN apt update && \
    apt upgrade && \
    apt install wget 
RUN wget https://gu-st.ru/content/Other/doc/russiantrustedca.pem  && \
    cp russiantrustedca.pem /certificates

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]