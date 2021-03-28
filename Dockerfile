FROM openjdk:11
ADD target/kathelan-image-detection-1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]