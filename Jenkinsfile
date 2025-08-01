pipeline {
    agent any

    environment {
        APP_NAME = "springboot-app"
        DOCKER_IMAGE = "springboot-app"
        // DOCKER_BUILDKIT = '0'
    }

    stages {
        stage('Clone Repository') {
            steps {
			    git url: 'https://github.com/Manivannanbgi007/simpleapp.git', branch: 'main'
            }
        }

        stage('Build JAR') {
            steps {
                bat './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %DOCKER_IMAGE% .'
            }
        }

        stage('Stop Existing Containers') {
            steps {
                bat 'docker-compose down || true'
            }
        }

        stage('Deploy via Docker Compose') {
            steps {
                bat 'docker-compose up -d --build'
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
