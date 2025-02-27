pipeline {
    agent any
    triggers {
          githubPush()
       }
    environment {
            DOCKER_IMAGE_NAME = 'spe_calculator'
            GITHUB_REPO_URL = 'https://github.com/PrajyotShende/SPE_Calculator.git'
        }

    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
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
                withCredentials([usernamePassword(credentialsId: 'docker-id', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh '''
                    docker login -u $DOCKER_USER -p $DOCKER_PASS
                    docker tag prajyotshende/spe_calculator prajyotshende/spe_calculator:latest
                    docker push prajyotshende/spe_calculator:latest
                    '''
                }
            }
        }
        stage('Ansible Deploy') {
            steps {
                sh 'ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }
}
