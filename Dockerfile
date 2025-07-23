FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
EXPOSE 8200

# Create logs directory with full permissions
RUN mkdir -p /logs && chmod -R 777 /logs
#RUN mkdir -p /logs && chown -R appuser:appuser /logs && chmod -R 775 /logs

COPY ${JAR_FILE} springboot-app.jar

# Switch to non-root user
#USER appuser

ENTRYPOINT ["java","-jar","/springboot-app.jar"]