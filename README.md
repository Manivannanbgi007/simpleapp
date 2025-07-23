# simpleapp
This application has been developed using the Spring Boot framework. It has been integrated with Grafana, Loki, Promtail, and Prometheus. The application can be deployed using Docker.

We have created a docker-compose.yml file that includes containers for the Spring Boot application, Grafana, Loki, Prometheus, and Promtail.

To build and run the application, follow the steps below:

Navigate to the root directory of your Spring Boot application, where the pom.xml, Dockerfile, and docker-compose.yml files are located.

Run the following command to build the application JAR file:

mvn clean install

This command will generate the latest Spring Boot JAR file for your application.

To stop all running containers on your Docker environment, use:

docker-compose down

To build the Docker images and start the containers, run:

docker-compose up --build

Service URLs and Credentials:

Grafana: http://localhost:3000
Username: admin
Password: admin

Loki: http://localhost:3100/ready
If the response is 'ready', it indicates that Loki is running successfully.
