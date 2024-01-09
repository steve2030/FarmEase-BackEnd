pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout code from Git repository
                    https://github.com/steve2030/FarmEase-BackEnd
                }
            }
        }

        stage('Unit Test') {
            steps {
                script {
                    // Run unit tests for Java application
                    sh 'mvn clean test'
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                script {
                    // Perform static code analysis (e.g., using SonarQube)
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build the application
                    sh 'mvn clean install'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    sh 'docker build -t your-image-name .'
                }
            }
        }

        stage('Push to GCR') {
            steps {
                script {
                    // Configure Docker to use GCR
                    withCredentials([gcrServiceAccount('your-gcr-service-account')]) {
                        // Authenticate Docker with GCR
                        sh 'gcloud auth configure-docker gcr.io'

                        // Tag the Docker image for GCR
                        sh 'docker tag your-image-name gcr.io/your-gcp-project/your-image-name'

                        // Push the Docker image to GCR
                        sh 'docker push gcr.io/your-gcp-project/your-image-name'
                    }
                }
            }
        }
    }
}
