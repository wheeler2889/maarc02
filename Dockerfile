FROM openjdk:17
EXPOSE 8080 8000
ADD target/maarc-0.0.2-SNAPSHOT.jar service.jar
ENTRYPOINT ["java","-jar", "/service.jar"]
