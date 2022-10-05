FROM openjdk:11

COPY target/SB-Docker-App.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "SB-Docker-App.jar"]
