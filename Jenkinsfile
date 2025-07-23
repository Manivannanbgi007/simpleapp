pipeline {
    agent any

    environment {
        APP_NAME = "simpleapp"
        DOCKER_IMAGE = "simpleapp:latest"
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/Manivannanbgi007/simpleapp.git'
            }
        }

        stage('Build JAR') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Stop Existing Containers') {
            steps {
                sh 'docker-compose down || true'
            }
        }

        stage('Deploy via Docker Compose') {
            steps {
                sh 'docker-compose up -d --build'
            }
        }
    }

    post {
        success {
            echo "Deployment successful!"
        }
        failure {
            echo "Deployment failed!"
        }
    }
}
