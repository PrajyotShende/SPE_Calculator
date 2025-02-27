pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t prajyotshende/SPE_Calculator .'
            }
        }
        stage('Docker Push') {
            steps {
                withCredentials([string(credentialsId: 'docker-hub-credentials', variable: 'DOCKER_PASS')]) {
                    sh '''
                    docker login -u prajyotshende -p $DOCKER_PASS
                    docker tag prajyotshende/SPE_Calculator prajyotshende/SPE_Calculator:latest
                    docker push prajyotshende/SPE_Calculator:latest
                    '''
                }
            }
        }
    }
}
