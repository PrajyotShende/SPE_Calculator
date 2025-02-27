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
                sh 'docker build -t prajyotshende/spe_calculator .'
            }
        }
        stage('Docker Push') {
            steps {
                withCredentials([string(credentialsId: 'docker-hub-credentials', variable: 'DOCKER_PASS')]) {
                    sh '''
                    docker login -u prajyotshende -p $DOCKER_PASS
                    docker tag prajyotshende/spe_calculator prajyotshende/spe_calculator:latest
                    docker push prajyotshende/spe_calculator:latest
                    '''
                }
            }
        }
    }
}
