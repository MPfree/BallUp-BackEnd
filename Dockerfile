FROM openjdk:8
EXPOSE 80808
ADD target/BallUp-docker.jar BallUp-docker.jar
ENTRYPOINT ["java","-jar","/BallUp-docker.jar"]

