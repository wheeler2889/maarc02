FROM openjdk:17
EXPOSE 8080 8000
ADD target/maarc-0.0.1-SNAPSHOT.jar service.jar
ADD entrypoint.sh entrypoint.sh
ENTRYPOINT ["sh","/entrypoint.sh"]
