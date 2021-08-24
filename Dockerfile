FROM openjdk:11-oracle
EXPOSE 8080
COPY website/build/libs/home-status-[0-9].[0-9].[0-9]-SNAPSHOT.jar home-status.jar
ENTRYPOINT ["java", "-jar", "/home-status.jar"]
