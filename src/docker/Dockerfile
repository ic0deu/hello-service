FROM openjdk:8-alpine
RUN mkdir -p /opt/ic0deu/hello-service/
ADD hello-service-1.0-SNAPSHOT.jar /opt/ic0deu/hello-service/

EXPOSE 8080
CMD ["java", "-jar", "/opt/ic0deu/hello-service/hello-service-1.0-SNAPSHOT.jar", "server", "config.yml"]