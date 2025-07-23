FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
EXPOSE 8200
COPY ${JAR_FILE} simpleapp.jar
ENTRYPOINT ["java","-jar","/simpleapp.jar"]